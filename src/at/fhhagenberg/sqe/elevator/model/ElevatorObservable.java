package at.fhhagenberg.sqe.elevator.model;

import java.util.Observable;

import sqelevator.IElevator;

public class ElevatorObservable extends Observable {
	
	private IElevator controller;
	public ElevatorObservable( IElevator _eif) {
		controller= _eif;
	}
	
	
	public void readValues() {
		Integer elevatorNumber = 0;
		Integer floorId;
		
		
		controller.getCommittedDirection(elevatorNumber);
		controller.
		
	}
}
