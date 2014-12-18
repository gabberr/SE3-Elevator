package at.fhhagenberg.sqe.elevator.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class View {

	private static final int WINDOW_WIDTH = 900;
	private static final int WINDOW_HEIGHT = 580;
	
	private JFrame frame = null;
	private JPanel mainPanel = null;
	private JPanel simulationPanel = null;
	private JPanel statusPanel = null;
	private JPanel controlPanel = null;
	
	
	public View(){
		buildUI();
	}
	
	private void buildUI(){
		//set up the frame
		frame = new JFrame("Cerebro");
		frame.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(1, 3));
		simulationPanel = new JPanel();
		simulationPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		statusPanel = new JPanel();
		statusPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		controlPanel = new JPanel();
		controlPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
		
		mainPanel.add(simulationPanel);
		mainPanel.add(statusPanel);
		mainPanel.add(controlPanel);
		
		//add main panel to frame
		frame.add(mainPanel);
		
		//set the frame visible
		frame.setVisible(true);
	}

}
