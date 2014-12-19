 package at.fhhagenberg.sqe.elevator.model;

import java.rmi.RemoteException;
import java.util.ArrayList;

import at.fhhagenberg.sqe.elevator.model.floor.Floor;
import sqelevator.IElevator;

public class Elevator extends ElevatorAdapter {
	
	ArrayList<ElevatorCart> carts = null;
	

	ArrayList<Floor> floors = null;

	public Elevator(ArrayList<ElevatorCart> _carts, ArrayList<Floor> _floors) {
		carts = new ArrayList<ElevatorCart>();
		floors = new ArrayList<Floor>();
		carts=_carts;
		floors = _floors;
	}
	public Elevator()
	{
		carts = new ArrayList<ElevatorCart>();
		floors = new ArrayList<Floor>();
	}
	@Override
	public int getCommittedDirection(int elevatorNumber) {
		return carts.get(elevatorNumber).getCommitedDirection();
	}

	@Override
	public boolean getElevatorButton(int elevatorNumber, int floor) {
		// TODO Auto-generated method stub
		return carts.get(elevatorNumber).getElevatorButton(floor);
	}

	@Override
	public int getElevatorDoorStatus(int elevatorNumber) {
		// TODO Auto-generated method stub
		return carts.get(elevatorNumber).getDoorStatus();
	}

	@Override
	public int getElevatorFloor(int elevatorNumber) {
		return carts.get(elevatorNumber).getCurrentFloor();
	}

	@Override
	public int getElevatorNum() {
		return 2;
	}

	@Override
	public int getElevatorPosition(int elevatorNumber) {
		// position same as floor number
		return carts.get(elevatorNumber).getCurrentFloor();
	}

	@Override
	public int getFloorHeight() {
		return 1;
	}

	@Override
	public int getFloorNum() {
		return 10;
	}

	@Override
	public int getTarget(int elevatorNumber) {
		return carts.get(elevatorNumber).getNextDestination();
	}

	@Override
	public void setCommittedDirection(int elevatorNumber, int direction) {
		carts.get(elevatorNumber).setCommitedDirection(direction);
	}

	@Override
	public void setTarget(int elevatorNumber, int target) {
		carts.get(elevatorNumber).addDestinatoin(target);
	}

	/**
	 * @return the carts
	 */
	public ArrayList<ElevatorCart> getCarts() {
		return this.carts;
	}
	/**
	 * @param carts the carts to set
	 */
	public void setCarts(ArrayList<ElevatorCart> carts) {
		this.carts = carts;
	}
	/**
	 * @return the floors
	 */
	public ArrayList<Floor> getFloors() {
		return this.floors;
	}
	/**
	 * @param floors the floors to set
	 */
	public void setFloors(ArrayList<Floor> floors) {
		this.floors = floors;
	}


}
