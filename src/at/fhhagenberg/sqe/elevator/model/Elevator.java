 package at.fhhagenberg.sqe.elevator.model;

import java.rmi.RemoteException;
import java.util.ArrayList;

import sqelevator.IElevator;

public class Elevator implements IElevator {
	
	ArrayList<ElevatorCart> carts = new ArrayList<ElevatorCart>();

	public Elevator(ArrayList<ElevatorCart> _carts) {
		carts=_carts;
	}
	@Override
	public int getCommittedDirection(int elevatorNumber) {
		// TODO Auto-generated method stub
		return carts.get(elevatorNumber).getCommitedDirection();
	}

	@Override
	public int getElevatorAccel(int elevatorNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getElevatorButton(int elevatorNumber, int floor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getElevatorDoorStatus(int elevatorNumber) {
		// TODO Auto-generated method stub
		return carts.get(elevatorNumber).getStatus();
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
	public int getElevatorSpeed(int elevatorNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getElevatorWeight(int elevatorNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getFloorButtonDown(int floor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getFloorButtonUp(int floor) {
		// TODO Auto-generated method stub
		return false;
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
	public boolean getServicesFloors(int elevatorNumber, int floor) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getTarget(int elevatorNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCommittedDirection(int elevatorNumber, int direction) {
		carts.get(elevatorNumber).setCommitedDirection(direction);

	}

	@Override
	public void setServicesFloors(int elevatorNumber, int floor, boolean service) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTarget(int elevatorNumber, int target) {
		carts.get(elevatorNumber).getNextDestination(); 

	}

	@Override
	public int getElevatorCapacity(int elevatorNumber) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long getClockTick() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

}
