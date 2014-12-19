package at.fhhagenberg.sqe.elevator.model;

import java.util.ArrayList;

public class ElevatorData {
	
	private ArrayList<ElevatorBox> elevatorBoxesList = new ArrayList<ElevatorData.ElevatorBox>();
	private ArrayList <Integer> floorButtonsUp= new ArrayList<Integer>();
	private ArrayList <Integer> floorButtonsDown = new ArrayList<Integer>();
	
	public ElevatorData(){
		
	}
	
	public void addElevatorBox(int elevatorDir, int elevatorAccel,
			int elevatorDoorStatus, int elevatorClosestFloor,
			int elevatorNumber, int elevatorPosition, int elevatorSpeed,
			int elevatorWeight, int elevatorCapacity, int targetFloor,
			ArrayList<Boolean> elevatorPressedButtons){
		
		elevatorBoxesList.add(new ElevatorBox(elevatorDir, elevatorAccel,
			elevatorDoorStatus, elevatorClosestFloor,
			elevatorNumber, elevatorPosition, elevatorSpeed,
			elevatorWeight, elevatorCapacity, targetFloor,
			elevatorPressedButtons));
	}
	
	public class ElevatorBox{
		private int elevatorDir = 0;
		private int elevatorAccel = 0;
		private int elevatorDoorStatus= 0;
		private int elevatorClosestFloor = 0;
		private int elevatorNumber=	0;
		private int elevatorPosition = 0;
		private int elevatorSpeed = 0;
		private int elevatorWeight = 0;
		private int elevatorCapacity = 	0;
		private int targetFloor = 0;
		private ArrayList <Boolean> elevatorPressedButtons = null;	
		
		
		private ElevatorBox(){
			elevatorPressedButtons = new ArrayList<Boolean>();
			floorButtonsUp = new ArrayList<Integer>();
			floorButtonsDown = new ArrayList<Integer>();
		}

		public ElevatorBox(int elevatorDir, int elevatorAccel,
				int elevatorDoorStatus, int elevatorClosestFloor,
				int elevatorNumber, int elevatorPosition, int elevatorSpeed,
				int elevatorWeight, int elevatorCapacity, int targetFloor,
				ArrayList<Boolean> elevatorPressedButtons) {
			super();
			this.elevatorDir = elevatorDir;
			this.elevatorAccel = elevatorAccel;
			this.elevatorDoorStatus = elevatorDoorStatus;
			this.elevatorClosestFloor = elevatorClosestFloor;
			this.elevatorNumber = elevatorNumber;
			this.elevatorPosition = elevatorPosition;
			this.elevatorSpeed = elevatorSpeed;
			this.elevatorWeight = elevatorWeight;
			this.elevatorCapacity = elevatorCapacity;
			this.targetFloor = targetFloor;
			this.elevatorPressedButtons = elevatorPressedButtons;
		}

		public int getElevatorDir() {
			return elevatorDir;
		}

		public void setElevatorDir(int elevatorDir) {
			this.elevatorDir = elevatorDir;
		}

		public int getElevatorAccel() {
			return elevatorAccel;
		}

		public void setElevatorAccel(int elevatorAccel) {
			this.elevatorAccel = elevatorAccel;
		}

		public int getElevatorDoorStatus() {
			return elevatorDoorStatus;
		}

		public void setElevatorDoorStatus(int elevatorDoorStatus) {
			this.elevatorDoorStatus = elevatorDoorStatus;
		}

		public int getElevatorClosestFloor() {
			return elevatorClosestFloor;
		}

		public void setElevatorClosestFloor(int elevatorClosestFloor) {
			this.elevatorClosestFloor = elevatorClosestFloor;
		}

		public int getElevatorNumber() {
			return elevatorNumber;
		}

		public void setElevatorNumber(int elevatorNumber) {
			this.elevatorNumber = elevatorNumber;
		}

		public int getElevatorPosition() {
			return elevatorPosition;
		}

		public void setElevatorPosition(int elevatorPosition) {
			this.elevatorPosition = elevatorPosition;
		}

		public int getElevatorSpeed() {
			return elevatorSpeed;
		}

		public void setElevatorSpeed(int elevatorSpeed) {
			this.elevatorSpeed = elevatorSpeed;
		}

		public int getElevatorWeight() {
			return elevatorWeight;
		}

		public void setElevatorWeight(int elevatorWeight) {
			this.elevatorWeight = elevatorWeight;
		}

		public int getElevatorCapacity() {
			return elevatorCapacity;
		}

		public void setElevatorCapacity(int elevatorCapacity) {
			this.elevatorCapacity = elevatorCapacity;
		}

		public int getTargetFloor() {
			return targetFloor;
		}

		public void setTargetFloor(int targetFloor) {
			this.targetFloor = targetFloor;
		}

		public ArrayList<Boolean> getElevatorPressedButtons() {
			return elevatorPressedButtons;
		}
		
		public void addElevatorPressedButtons(boolean b){
			elevatorPressedButtons.add(b);
		}

		public void setElevatorPressedButtons(ArrayList<Boolean> elevatorPressedButtons) {
			this.elevatorPressedButtons = elevatorPressedButtons;
		}
	}

}
