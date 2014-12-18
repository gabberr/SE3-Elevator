 package at.fhhagenberg.sqe.elevator.model;

import java.rmi.RemoteException;
import java.util.ArrayList;

import sqelevator.IElevator;

public class Elevator extends ElevatorAdapter {
	
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


}
