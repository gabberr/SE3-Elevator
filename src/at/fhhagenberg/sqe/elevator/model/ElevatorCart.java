package at.fhhagenberg.sqe.elevator.model;

import java.util.LinkedList;
import java.util.Queue;


public class ElevatorCart implements ElevatorCartIF {
	  
	private Integer currentFloor; 
	
	private Queue<Integer> destinationFloors;
	 
	  
	public ElevatorCart(Integer currentFloor, Queue<Integer> destinationFloors) {
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
		return destinationFloors.peek();
	}

	@Override
	public int getCurrentFloor() {
		return currentFloor;
	}

	@Override
	public void setCommitedDirection(int direction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getCommitedDirection() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getStatus() {
		// TODO Auto-generated method stub
		return 0;
	}

}
