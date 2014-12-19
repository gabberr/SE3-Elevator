package at.fhhagenberg.sqe.elevator.model;

import java.util.LinkedList;
import java.util.Queue;


public class ElevatorCart implements ElevatorCartIF {
	  
	private Integer currentFloor; 
	
	private Queue<Integer> destinationFloors;
	
	private Integer commitedDirection;
	private Integer speed;
	 
	  
	public ElevatorCart(Integer currentFloor) {
	    this.currentFloor = currentFloor;
	    this.destinationFloors = new LinkedList<Integer>(); // Queue is abstract
	  }
	  
	@Override
	public void moveUp() {
		currentFloor++;
	}

	@Override
	public void moveDown() {
		currentFloor--;	
	}

	@Override
	public void addDestinatoin(Integer destination) {
		destinationFloors.add(destination);	
	}

	@Override
	public int getNextDestination() {
		Integer nextDestination = destinationFloors.peek();
		if(nextDestination !=null)
			return nextDestination;
		else
			return -1;
	}

	@Override
	public int getCurrentFloor() {
		return currentFloor;
	}

	@Override
	public void setCommitedDirection(int direction) {
		commitedDirection = direction;
		
	}

	@Override
	public int getCommitedDirection() {
		return commitedDirection;
	}

	@Override
	public int getDoorStatus() {
		
		// TODO: add other statuses, opening and closeing
		
		if(speed == 0) {
			return Elevator.ELEVATOR_DOORS_OPEN;
		}
		else {
			return Elevator.ELEVATOR_DOORS_CLOSED;
		}
//		return 0;
	}

	@Override
	public int getWeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getElevatorButton(int floor) {
		return destinationFloors.contains(floor);
	}

	@Override
	public int getElevatorDirection() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getCurrentPayload() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getSpeed() {
		// TODO Auto-generated method stub
		return speed;
	}

}
