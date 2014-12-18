package at.fhhagenberg.sqe.elevator.view;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimulationGridPlaceHolderPanel extends JPanel {
	private static final int FLOOR_TITLE = 0;
	private static final int FLOOR_NUM = 1;
	private static final int ELEVATOR_TITLE = 2;
	private static final int ELEVATOR_FLOOR = 3;
	
	//grid cell panel types are:
	// - floor title
	// - floor title
	// - elevator title
	// - elevator pos
	
	private String gridType = "";
	private int panelType = 0;
	private int rowNum = 0;
	private int colNum = 0;
	private int floorNum = 0;
	
	public SimulationGridPlaceHolderPanel(int rowNum, int colNum, String gridType, int floorNum){
		super();
		this.rowNum = rowNum;
		this.colNum = colNum;
		this.gridType = gridType;
		this.floorNum = floorNum;
		determineType();
	}
	
	private void determineType(){
		if(rowNum == 0){
			setBorder(BorderFactory.createLineBorder(Color.black));
			if(colNum == 0){
				JLabel label = new JLabel("floor#");
				this.add(label);
			}else if(colNum > 0){
				JLabel label = new JLabel("Elev"+colNum);
				this.add(label);
			}
		}else if(rowNum > 0){
			if( colNum == 0 ){
				setBorder(BorderFactory.createLineBorder(Color.BLACK));
				JLabel label = new JLabel(""+ (floorNum - rowNum + 1));
				this.add(label);
			}else if( colNum > 0 ){
				setBorder(BorderFactory.createLineBorder(Color.lightGray));
				JLabel label = new JLabel("(" + rowNum + ", " + colNum + ")"); //new JLabel(); 
				this.add(label);
			}
		}
	}
}
