package at.fhhagenberg.sqe.elevator.model;

import java.rmi.RemoteException;

import sqelevator.IElevator;

public class ElevatorAdapter implements IElevator {

	@Override
	public int getCommittedDirection(int elevatorNumber) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getElevatorAccel(int elevatorNumber) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getElevatorButton(int elevatorNumber, int floor)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getElevatorDoorStatus(int elevatorNumber) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getElevatorFloor(int elevatorNumber) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getElevatorNum() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getElevatorPosition(int elevatorNumber) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getElevatorSpeed(int elevatorNumber) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getElevatorWeight(int elevatorNumber) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getElevatorCapacity(int elevatorNumber) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getFloorButtonDown(int floor) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean getFloorButtonUp(int floor) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getFloorHeight() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getFloorNum() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean getServicesFloors(int elevatorNumber, int floor)
			throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getTarget(int elevatorNumber) throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setCommittedDirection(int elevatorNumber, int direction)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setServicesFloors(int elevatorNumber, int floor, boolean service)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setTarget(int elevatorNumber, int target)
			throws RemoteException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public long getClockTick() throws RemoteException {
		// TODO Auto-generated method stub
		return 0;
	}

}
