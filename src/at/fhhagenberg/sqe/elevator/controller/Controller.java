package at.fhhagenberg.sqe.elevator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.util.ArrayList;

import at.fhhagenberg.sqe.elevator.model.Elevator;
import at.fhhagenberg.sqe.elevator.model.ElevatorCart;
import at.fhhagenberg.sqe.elevator.model.floor.Floor;
import at.fhhagenberg.sqe.elevator.view.View;

public class Controller {
	View view = null;
	Elevator elevator = null;
	ElevatorCart cart= null;
	Floor floor= null;
	ArrayList<ElevatorCart> carts = null;
	ArrayList<Floor> floors = null;
	
	public Controller(View view){
		this.view = view;
		cart = new ElevatorCart(0);
		floor = new Floor();
		carts = new ArrayList<ElevatorCart>();
		floors = new ArrayList<Floor>();
		addCarts();
		addFloors();
		this.elevator = new Elevator(carts,floors);
		
		setUpButtonListeners();
	}
	
	private void setUpButtonListeners(){
		for(int i = 0; i < view.getControlPanelButtons().size(); i++){
			final int comboBoxIndex = i;
			view.getControlPanelButtons().get(i).addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String targetFloorString = (String) view.getControlPanelComboBoxes().get(comboBoxIndex).getSelectedItem();
					String[] tokens = targetFloorString.split(" ", 0);
					int targetFloorNumber = Integer.parseInt(tokens[1]);
					JLabel tempLabel = (JLabel) view.getGridPanels()[view.getFloorsNumber() - targetFloorNumber + 1][comboBoxIndex+1].getComponent(0); 
					tempLabel.setText("----");
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

	public void simulateMoving(){
		   
	}	
}
