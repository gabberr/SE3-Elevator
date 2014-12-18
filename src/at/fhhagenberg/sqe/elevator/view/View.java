package at.fhhagenberg.sqe.elevator.view;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class View {

	private static final int WINDOW_WIDTH = 900;
	private static final int WINDOW_HEIGHT = 580;
	
	private JFrame frame = null;
	private JPanel mainPanel = null;
	private JPanel simulationPanel = null;
	private JPanel statusPanel = null;
	private JPanel controlPanel = null;
	
	private int floorNum = 10;
	private int elevatorNum = 2;
	
	
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
		simulationPanel.setLayout(new GridLayout((floorNum+1), (elevatorNum+1)));
		setUpSimulationPanel();
		
		statusPanel = new JPanel();
		statusPanel.setBorder(new TitledBorder("Status"));
		statusPanel.setLayout(new GridLayout(elevatorNum, 1));
		setUpStatusPanel();
		
		controlPanel = new JPanel();
		controlPanel.setBorder(new TitledBorder("Control"));
		
		mainPanel.add(simulationPanel);
		mainPanel.add(statusPanel);
		mainPanel.add(controlPanel);
		
		//add main panel to frame
		frame.add(mainPanel);
		
		//set the frame visible
		frame.setVisible(true);
	}
	
	private void setUpSimulationPanel(){
		JPanel[][] gridPanels = new JPanel[floorNum+1][elevatorNum+1];
		for(int i = 0; i < (floorNum+1); i++){
			for(int j = 0; j < (elevatorNum+1); j++){
				if(i == 0){
					if(j == 0){
						gridPanels[i][j] = new SimulationGridPlaceHolderPanel(i, j, "floorTitle");
						simulationPanel.add(gridPanels[i][j]);
					}else if(j > 0){
						gridPanels[i][j] = new SimulationGridPlaceHolderPanel(i, j, "elevatorTitle");
						simulationPanel.add(gridPanels[i][j]);
					}
				}else if(i > 0){
					if( j == 0 ){
						gridPanels[i][j] = new SimulationGridPlaceHolderPanel(i, j, "floorNum");
						simulationPanel.add(gridPanels[i][j]);
					}else if( j > 0 ){
						gridPanels[i][j] = new SimulationGridPlaceHolderPanel(i, j, "elevatorPos");
						simulationPanel.add(gridPanels[i][j]);
					}
				}
			}
		}
	}
	
	private void setUpStatusPanel(){
		for(int i = 1; i <= elevatorNum; i++){
			JPanel elevPanel = new JPanel();
			elevPanel.setBorder(new TitledBorder("Elev"+i));
			statusPanel.add(elevPanel);
		}
	}
}
		