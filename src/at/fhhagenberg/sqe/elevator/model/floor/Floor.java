package at.fhhagenberg.sqe.elevator.model.floor;

public class Floor implements FloorIF {
	
	private int floorId;
	private boolean floorButtonUpPressed = false;
	private boolean floorButtonDownPressed = false;
	@Override
	public boolean getFloorButtonDown() {
		// TODO Auto-generated method stub
		return floorButtonDownPressed;
	}
	@Override
	public boolean getFloorButtonUp() {
		// TODO Auto-generated method stub
		return floorButtonUpPressed;
	}
}
