package at.fhhagenberg.sqe.elevator.model;

public interface ElevatorCartIF {
	  public void moveUp();
	  public void moveDown();
	  public void addDestinatoin(Integer destination);
	  public int getNextDestination();
	  public int getCurrentFloor();
	  
//	  direction direction being set where up=0, down=1 and uncommitted=2
	  public void setCommitedDirection(int direction);
	  public int getCommitedDirection();
	  
	  public int getWeight();
	  // ELEVATOR_DIRECTION_UP
	 //  int direction =2 ;

//		/** State variable for elevator doors open.	 */

  //  ELEVATOR_DOORS_OPEN = 1, ELEVATOR_DOORS_CLOSED=2
	  public int getStatus();
		


	}