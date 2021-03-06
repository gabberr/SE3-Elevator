package at.fhhagenberg.sqe.elevator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JLabel;
import javax.swing.SwingConstants;

import sqelevator.IElevator;
import at.fhhagenberg.sqe.elevator.model.Elevator;
import at.fhhagenberg.sqe.elevator.model.ElevatorCart;
import at.fhhagenberg.sqe.elevator.model.ElevatorData;
import at.fhhagenberg.sqe.elevator.model.ElevatorObservable;
import at.fhhagenberg.sqe.elevator.model.floor.Floor;
import at.fhhagenberg.sqe.elevator.view.View;

public class ViewController implements Observer{
	View view = null;
	Elevator elevator = null;
	ElevatorCart cart= null;
	Floor floor= null;
	ArrayList<ElevatorCart> carts = null;
	ArrayList<Floor> floors = null;
	IElevator ielevator;
	
	public ViewController(View view, IElevator ielevator){
		this.view = view;
		cart = new ElevatorCart(0);
		floor = new Floor();
		carts = new ArrayList<ElevatorCart>();
		floors = new ArrayList<Floor>();
		this.ielevator = ielevator;
		addCarts();
		addFloors();
		this.elevator = new Elevator(carts,floors);
		setUpButtonListeners();
	}
	
	private void setUpButtonListeners() {
		for(int i = 0; i < view.getControlPanelButtons().size(); i++){
			final int comboBoxIndex = i;
			view.getControlPanelButtons().get(i).addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String targetFloorString = (String) view.getControlPanelComboBoxes().get(comboBoxIndex).getSelectedItem();
					String[] tokens = targetFloorString.split(" ", 0);
					int targetFloorNumber = Integer.parseInt(tokens[1]) - 1;
					
					//JLabel tempLabel = (JLabel) view.getGridPanels()[view.getFloorsNumber() - targetFloorNumber + 1][comboBoxIndex+1].getComponent(0);
					try {
						ielevator.setTarget(comboBoxIndex, targetFloorNumber);
					} catch (RemoteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
//					JLabel tempLabel = (JLabel) view.getGridPanels()[view.getFloorsNumber() - targetFloorNumber + 1][comboBoxIndex+1].getComponent(0); 
//					tempLabel.setText("----");
				}
			});
		}
	}
	
   private void addFloors() {
//	   for (int i = 0; i < 10; i++) {
//		   floor.setFloorId(i+1);
//		   floors.add(floor);
//	   }	  
	}

	private void addCarts() {
		carts.add(cart);
	}
	
	private void emptyGridLabels(int elevatorNum){
		for(int i = 1; i < view.getFloorsNumber()+1; i++){
			JLabel tempLabel = (JLabel) view.getGridPanels()[i][elevatorNum].getComponent(0);
			tempLabel.setText("");
		}
	}
	
	public String elevatorDirectionToString(int status) {
		String s = "Unknown";
		switch(status) {
		case IElevator.ELEVATOR_DIRECTION_DOWN:
			return "Down";
		case IElevator.ELEVATOR_DIRECTION_UNCOMMITTED:
			return "Uncommitted";
		case IElevator.ELEVATOR_DIRECTION_UP:
			return "Up";
	
		}
		
		return s;
	}
	public String elevatorDoorToString(int status) {
		String s = "Unknown";
		switch(status) {
		case IElevator.ELEVATOR_DOORS_CLOSED:
			return "Door closed.";
		case IElevator.ELEVATOR_DOORS_CLOSING:
			return "Door closing.";
		case IElevator.ELEVATOR_DOORS_OPEN:
			return "Door open";
		case IElevator.ELEVATOR_DOORS_OPENING:
			return "Door opening";
		}
		
		return s;
	}

	@Override
	public void update(Observable o, Object arg) {
		if(o instanceof ElevatorObservable){
			ElevatorData elevData = (ElevatorData) arg;
			
			ArrayList upReversedList = elevData.getFloorButtonsUp();
			ArrayList downReversedList = elevData.getFloorButtonsDown();
			
			Collections.reverse(upReversedList);
			Collections.reverse(downReversedList);
			
			for(int i = 0; i < view.getFloorsNumber(); i++){
				JLabel tempLabel = (JLabel) view.getGridPanels()[i+1][1].getComponent(0);
				tempLabel.setText("<html>U: "+ upReversedList.get(i) + "<br/>D: " + downReversedList.get(i) + "</html>");
			}
			
			for(int i = 0; i < elevData.getElevatorBoxesList().size(); i++){
			
				
				JLabel positionLabel = (JLabel) view.getStatusPanelSubPanels().get(i).getComponent(0);
				
				Integer position = elevData.getElevatorBoxesList().get(i).getElevatorPosition();
				
				positionLabel.setText("position: " + position);
				if(i == 0){
					JLabel tempLabel = (JLabel) view.getGridPanels()[view.getFloorsNumber() - position][2].getComponent(0); 
					emptyGridLabels(2);
					tempLabel.setText("----");
				}
				
				if(i == 1){
					JLabel tempLabel1 = (JLabel) view.getGridPanels()[view.getFloorsNumber() - position][3].getComponent(0); 
					emptyGridLabels(3);
					tempLabel1.setText("----");
				}
			
				
				JLabel directionLabel = (JLabel) view.getStatusPanelSubPanels().get(i).getComponent(1);
				directionLabel.setText("direction: " + elevatorDirectionToString(elevData.getElevatorBoxesList().get(i).getElevatorDir()));
				
				JLabel loadLabel = (JLabel) view.getStatusPanelSubPanels().get(i).getComponent(2);
				loadLabel.setText("load: " + elevData.getElevatorBoxesList().get(i).getElevatorWeight());
				
				JLabel speedLabel = (JLabel) view.getStatusPanelSubPanels().get(i).getComponent(3);
				speedLabel.setText("speed: " + elevData.getElevatorBoxesList().get(i).getElevatorDir());
				
				JLabel doorLabel = (JLabel) view.getStatusPanelSubPanels().get(i).getComponent(4);
				doorLabel.setText("doors: " + elevatorDoorToString(elevData.getElevatorBoxesList().get(i).getElevatorDoorStatus()));
				
			}
			
		}
	}	
}
