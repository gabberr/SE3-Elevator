 package at.fhhagenberg.sqe.elevator.model;

import java.rmi.RemoteException;

public class Elevator implements IElevator {

	@Override
	public int getCommittedDirection(int elevatorNumber) {
		// TODO Auto-generated method stub
		return 0;
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
		return 0;
	}

	@Override
	public int getElevatorFloor(int elevatorNumber) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getElevatorNum() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getElevatorPosition(int elevatorNumber) {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFloorNum() {
		// TODO Auto-generated method stub
		return 0;
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
		// TODO Auto-generated method stub

	}

	@Override
	public void setServicesFloors(int elevatorNumber, int floor, boolean service) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setTarget(int elevatorNumber, int target) {
		// TODO Auto-generated method stub

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
