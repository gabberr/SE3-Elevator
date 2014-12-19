package at.fhhagenberg.sqe.elevator.model;

import java.rmi.RemoteException;
import java.util.Observable;

import sqelevator.IElevator;

public class ElevatorObservable extends Observable {
	
	private IElevator controller;
	public ElevatorObservable( IElevator _eif) {
		controller= _eif;
	}
	
	
	public void readValues() throws RemoteException{
		ElevatorData data = new ElevatorData();
		Integer elevatorNumber = 0;
		Integer floorId;
		
		
		Long clockTick = controller.getClockTick();
		Integer numberOfElevators = controller.getElevatorNum();
		Integer numberOfFloors = controller.getFloorNum();
		Integer floorHeight = controller.getFloorHeight();
		
		Integer commitedDirection = controller.getCommittedDirection(elevatorNumber);
		Integer target = controller.getTarget(elevatorNumber);
//		data.setTarger(target)
		
		Integer speed = controller.getElevatorSpeed(elevatorNumber);
		Integer position = controller.getElevatorPosition(elevatorNumber);
		Integer accl = controller.getElevatorAccel(elevatorNumber);
		Integer doorStatus = controller.getElevatorDoorStatus(elevatorNumber);
		
		Integer closestFloor = controller.getElevatorFloor(elevatorNumber);
		
		Integer capacity = controller.getElevatorCapacity(elevatorNumber);
		Integer elevatorWeight =controller.getElevatorWeight(elevatorNumber);
		
		for (int i = 0; i < numberOfFloors; i++) {
//			controller.get
			
		}
		
		
		
		
		
		
		
		
	}
}
