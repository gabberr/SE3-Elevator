package at.fhhagenberg.sqe.elevator.model.floor;

public class Floor implements FloorIF {
	
	private int floorId;
	private boolean floorButtonUpPressed = false;
	private boolean floorButtonDownPressed = false;
	
	/**
	 * @return the floorId
	 */
	public int getFloorId() {
		return this.floorId;
	}
	/**
	 * @param floorId the floorId to set
	 */
	public void setFloorId(int floorId) {
		this.floorId = floorId;
	}

	/**
	 * @param floorButtonUpPressed the floorButtonUpPressed to set
	 */
	public void setFloorButtonUpPressed(boolean floorButtonUpPressed) {
		this.floorButtonUpPressed = floorButtonUpPressed;
	}
	
	/**
	 * @param floorButtonDownPressed the floorButtonDownPressed to set
	 */
	public void setFloorButtonDownPressed(boolean floorButtonDownPressed) {
		this.floorButtonDownPressed = floorButtonDownPressed;
	}
	@Override
	public boolean isFloorButtonUpPressed() {
		return false;
	}
	@Override
	public boolean isFloorButtonDownPressed() {
		return false;
	}
	
	
	
	

}
