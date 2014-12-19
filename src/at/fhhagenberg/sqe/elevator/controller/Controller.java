package at.fhhagenberg.sqe.elevator.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JLabel;
import javax.swing.JPanel;

import at.fhhagenberg.sqe.elevator.view.View;

public class Controller {
	View view = null;
	
	public Controller(View view){
		this.view = view;
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
//					System.out.println("button of elevator " + (comboBoxIndex+1) + " is pressed! " + targetFloorNumber);
//					JLabel targetFloorLabel = (JLabel) view.getGridPanels()[targetFloorNumber][comboBoxIndex].getComponent(0);
//					targetFloorLabel.setText("-");
				}
			});
		}
	}
	
	
}
