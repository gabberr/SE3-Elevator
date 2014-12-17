package at.fhhagenberg.sqe.elevator.model;

public interface ElevatorIF {
	  public void moveUp();
	  public void moveDown();
	  public void addDestinatoin(Integer destination);
	  public int getNextDestination();
	  public int getCurrentFloor();
// direction - up, down, held
// status - empty, occupied

	}