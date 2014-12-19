package at.fhhagenberg.sqe.elevator.view;

import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class View {

	private static final int WINDOW_WIDTH = 900;
	private static final int WINDOW_HEIGHT = 580;
	
	private JFrame frame = null;
	private JPanel mainPanel = null;
	private JPanel simulationPanel = null;
	private JPanel statusPanel = null;
	private JPanel controlPanel = null;
	
	private JPanel[][] gridPanels = null;
	
	private int floorNum = 25;
	private int elevatorNum = 6;
	
	ArrayList<JPanel> statusPanelSubPanels = new ArrayList<JPanel>();
	ArrayList<JComboBox> controlPanelComboBoxes = new ArrayList<JComboBox>();
	ArrayList<JButton> controlPanelButtons = new ArrayList<JButton>();
	
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
		simulationPanel.setLayout(new GridLayout((floorNum+2), (elevatorNum+1)));
		setUpSimulationPanel();
		
		statusPanel = new JPanel();
		statusPanel.setBorder(new TitledBorder("Status"));
		statusPanel.setLayout(new GridLayout(elevatorNum, 1));
		setUpStatusPanel();
		
		controlPanel = new JPanel();
		controlPanel.setBorder(new TitledBorder("Control"));
		controlPanel.setLayout(new GridLayout(elevatorNum, 1));
		setUpControlPanel();
		
		mainPanel.add(simulationPanel);
		mainPanel.add(statusPanel);
		mainPanel.add(controlPanel);
		
		//add main panel to frame
		frame.add(mainPanel);
		
		//set the frame visible
		frame.setVisible(true);
	}
	
	private void setUpSimulationPanel(){
		gridPanels = new JPanel[floorNum+2][elevatorNum+1];
		for(int i = 0; i < (floorNum+2); i++){
			for(int j = 0; j < (elevatorNum+1); j++){
				if(i == 0){
					if(j == 0){
						gridPanels[i][j] = new SimulationGridPlaceHolderPanel(i, j, "floorTitle", floorNum, elevatorNum);
						simulationPanel.add(gridPanels[i][j]);
					}else if(j > 0){
						gridPanels[i][j] = new SimulationGridPlaceHolderPanel(i, j, "elevatorTitle", floorNum, elevatorNum);
						simulationPanel.add(gridPanels[i][j]);
					}
				}else if(i > 0){
					if( j == 0 ){
						gridPanels[i][j] = new SimulationGridPlaceHolderPanel(i, j, "floorNum", floorNum, elevatorNum);
						simulationPanel.add(gridPanels[i][j]);
					}else if( j > 0 ){
						gridPanels[i][j] = new SimulationGridPlaceHolderPanel(i, j, "elevatorPos", floorNum, elevatorNum);
						simulationPanel.add(gridPanels[i][j]);
					}
				}
			}
		}
	}
	
	private void setUpStatusPanel(){
		for(int i = 1; i <= elevatorNum; i++){
			JPanel elevPanel = new JPanel();
			elevPanel.setLayout(new GridLayout(7,1));
			elevPanel.setBorder(new TitledBorder("Elev"+i));
			JLabel posLabel = new JLabel("position: ");
			JLabel dirLabel = new JLabel("direction: ");
			JLabel loadLabel = new JLabel("load: ");
			JLabel speedLabel = new JLabel("speed: ");
			JLabel doorLabel = new JLabel("doors: ");
			JLabel callsLabel = new JLabel("floor calls: ");
			JLabel targetsLabel = new JLabel("floor targets: ");
			
			elevPanel.add(posLabel);
			elevPanel.add(dirLabel);
			elevPanel.add(loadLabel);
			elevPanel.add(speedLabel);
			elevPanel.add(doorLabel);
			elevPanel.add(callsLabel);
			elevPanel.add(targetsLabel);
			
			statusPanelSubPanels.add(elevPanel);
			statusPanel.add(elevPanel);
		}
	}
	
	private void setUpControlPanel(){
		for(int i = 1; i <= elevatorNum; i++){
			JPanel elevPanel = new JPanel();
			elevPanel.setLayout(new GridLayout(2,1));
			elevPanel.setBorder(new TitledBorder("Elev"+i));
			
			JPanel autoOrManualPanel = new JPanel();
			JPanel fromToPanel = new JPanel();
			
			JRadioButton automaticModeRadioButton = new JRadioButton("automatic");
			JRadioButton manualModeRadioButton = new JRadioButton("manual");
			manualModeRadioButton.setSelected(true);
			ButtonGroup modeGroup = new ButtonGroup();
			modeGroup.add(automaticModeRadioButton);
			modeGroup.add(manualModeRadioButton);
			
			autoOrManualPanel.add(automaticModeRadioButton);
			autoOrManualPanel.add(manualModeRadioButton);
			
			fromToPanel.setLayout(new GridLayout(2, 1));
			JPanel toP = new JPanel();
			toP.setLayout(new GridLayout(1,2));
			
			String[] floorArray = new String[floorNum];
			for(int j = 0; j < floorNum; j++){
				floorArray[j] = "floor " + (j+1);
			}
			
			JComboBox toFloorComboBox = new JComboBox(floorArray);
			controlPanelComboBoxes.add(toFloorComboBox);
			
			JLabel toLabel = new JLabel("to: ");
			
			toP.add(toLabel);
			toP.add(toFloorComboBox);
			
			JButton executeButton = new JButton("execute");
			controlPanelButtons.add(executeButton);
			
			fromToPanel.add(toP);
			fromToPanel.add(executeButton);
			
			elevPanel.add(autoOrManualPanel);
			elevPanel.add(fromToPanel);
			
			controlPanel.add(elevPanel);
		}
	}
	
	public int getFloorsNumber(){
		return floorNum;
	}
	
	public void setFloorsNumber(int fn){
		floorNum = fn;
	}
	
	public JPanel[][] getGridPanels(){
		return gridPanels;
	}
	
	public ArrayList<JPanel> getStatusPanelSubPanels(){
		return statusPanelSubPanels;
	}
	
	public ArrayList<JComboBox> getControlPanelComboBoxes(){
		return controlPanelComboBoxes;
	}
	
	public ArrayList<JButton> getControlPanelButtons(){
		return controlPanelButtons;
	}
	
}
		