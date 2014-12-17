package at.fhhagenberg.sqe.elevator.model;

public interface ElevatorIF {
	/**
	 *  Retrieves the committed direction of the specified elevator (up / down / uncommitted)
	 * @param elevatorNumber
	 * @return
	 */
	int getCommittedDirection(int elevatorNumber);
	/**
	 * 	 Provides the current acceleration of the specified elevator in feet per sec^2
	 * @param elevatorNumber
	 * @return
	 */
	int getElevatorAccel(int elevatorNumber);

	/**
	 * 	 Provides the status of a floor request button on a specified elevator (on/off)
	 * @param elevatorNumber
	 * @param floor
	 * @return
	 */
	boolean getElevatorButton(int elevatorNumber, int floor);

	/**
	 * 	 Provides the current status of the doors of the specified elevator (open/closed)
	 * @param elevatorNumber
	 * @return
	 */
	int getElevatorDoorStatus(int elevatorNumber);

	/**
	 *  Provides the current location of the specified elevator to the nearest floor
	 * @param elevatorNumber
	 * @return
	 */
	int getElevatorFloor(int elevatorNumber);
	
	/**
	 * 	 Retrieves the number of elevators in the building
	 */
	int getElevatorNum();
	
	/**
	 * 	 Provides the current location of the specified elevator in feet from the bottom of the building
	 */
	int getElevatorPosition(int elevatorNumber);

	/**
	 * 	 Provides the current speed of the specified elevator in feet per sec
	 * @param elevatorNumber
	 * @return
	 */
	int getElevatorSpeed(int elevatorNumber);
	
	/**
	 * 	 Retrieves the weight of passengers on the specified elevator
	 * @param elevatorNumber
	 * @return
	 */
	int getElevatorWeight(int elevatorNumber);
	
	/**
	 *  Provides the status of the Down button on specified floor (on/off)
	 * @param floor
	 * @return
	 */
	boolean getFloorButtonDown(int floor);
	
	/**
	 *  Provides the status of the Up button on specified floor (on/off)
	 * @param floor
	 * @return
	 */
	boolean getFloorButtonUp(int floor);
	
	/**
	 *  Retrieves the height of the floors in the building
	 * @return
	 */
	int getFloorHeight();
	
	/**
	 * Retrieves the number of floors in the building
	 * @return
	 */
	int getFloorNum();
	 
	/**
	 *  Retrieves the current logging level
	 * @return
	 */
	int getLogging();
	
	/**
	 * Retrieves whether or not the specified elevator will service the specified floor (yes/no)
	 * @param elevatorNumber
	 * @param floor
	 * @return
	 */
	boolean getServicesFloors(int elevatorNumber, int floor);
	 
	
	/**
	 * Retrieves the floor target of the specified elevator
	 * @param elevatorNumber
	 * @return
	 */
	int getTarget(int elevatorNumber);
	 
	/**
	 * 	 Sets the committed direction of the specified elevator (up / down / uncommitted)
	 * @param elevatorNumber
	 * @param direction
	 */
	void setCommittedDirection(int elevatorNumber, int direction);

	/**
	 * Sets whether or not the specified elevator will service the specified floor (yes/no)
	 * @param elevatorNumber
	 * @param floor
	 * @param service
	 */
	void setServicesFloors(int elevatorNumber, int floor, boolean service);
	 
	/**
	 * Sets whether or not the specified elevator will service the specified floor (yes/no)
	 * @param elevatorNumber
	 * @param target
	 */
	void setTarget(int elevatorNumber, int target);
}
