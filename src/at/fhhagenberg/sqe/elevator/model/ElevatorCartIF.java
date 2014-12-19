package at.fhhagenberg.sqe.elevator.model;

public interface ElevatorCartIF {
	  public void moveUp();
	  public void moveDown();
	  public void move();
	  public void addDestinatoin(Integer destination);
	  public int getNextDestination();
	  public int getCurrentFloor();
	  
//	  direction direction being set where up=0, down=1 and uncommitted=2
	  public void setCommitedDirection(int direction);
	  public int getCommitedDirection();
	  
	  public int getWeight();
	  
	  public boolean getElevatorButton(int floor);
	  // ELEVATOR_DIRECTION_UP
	 //  int direction =2 ;
	  public int getElevatorDirection();
	  public int getCurrentPayload();
	  public int getSpeed();
	  
	  public void setSpeed(int speed);

//		/** State variable for elevator doors open.	 */

  //  ELEVATOR_DOORS_OPEN = 1, ELEVATOR_DOORS_CLOSED=2
	  public int getDoorStatus();
		


	}