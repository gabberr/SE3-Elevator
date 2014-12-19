package at.fhhagenberg.sqe.elevator.model;

import java.util.LinkedList;
import java.util.Queue;

import sqelevator.IElevator;


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

	@Override
	public void setSpeed(int _speed) {
		speed = _speed;
		if(speed > 0) {
			
		}
		
	}
	/**
	 * Moves it in the commited direction
	 */
	@Override
	public void move() {
		if(commitedDirection == Elevator.ELEVATOR_DIRECTION_DOWN)
			moveDown();
		if(commitedDirection == Elevator.ELEVATOR_DIRECTION_UP)
			moveUp();
		
	}
	private void moveElevator(){
			
			// -1 is null
			if(this.getCommitedDirection() != IElevator.ELEVATOR_DIRECTION_UNCOMMITTED) {
				Integer start = this.getCurrentFloor();
				Integer destination = this.getNextDestination();
				
				// if its already in the destination floor
				if(start == destination)
					this.setCommitedDirection(IElevator.ELEVATOR_DIRECTION_UNCOMMITTED);
				
				while(this.getCurrentFloor() != destination) {
					// move either up or down
					this.setSpeed(10);
					this.move();
					
				}
				this.setCommitedDirection(IElevator.ELEVATOR_DIRECTION_UNCOMMITTED);
				
				
				
			}
			
		}
	
}
