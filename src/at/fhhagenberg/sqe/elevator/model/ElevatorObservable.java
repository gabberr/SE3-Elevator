package at.fhhagenberg.sqe.elevator.model;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Observable;

import sqelevator.IElevator;

public class ElevatorObservable extends Observable {

	private IElevator controller;
	private ElevatorData currentValue;

	public ElevatorObservable(IElevator _eif) {
		controller = _eif;
	}

	public void readValues() throws RemoteException {

		Integer numberOfElevators = controller.getElevatorNum();
		Integer numberOfFloors = controller.getFloorNum();

		ElevatorData data = new ElevatorData();

		for (int i = 0; i < numberOfElevators; i++) {

			Integer elevatorNumber = 0;
			Integer floorId;

			Long clockTick = controller.getClockTick();

			Integer floorHeight = controller.getFloorHeight();

			Integer commitedDirection = controller
					.getCommittedDirection(elevatorNumber);
			Integer target = controller.getTarget(elevatorNumber);
			
			Integer direction = controller.getCommittedDirection(i);
			Integer speed = controller.getElevatorSpeed(i);
			Integer position = controller.getElevatorPosition(i);
			Integer accl = controller.getElevatorAccel(i);
			Integer doorStatus = controller
					.getElevatorDoorStatus(elevatorNumber);

			Integer closestFloor = controller.getElevatorFloor(i);
			Integer capacity = controller.getElevatorCapacity(i);
			Integer elevatorWeight = controller
					.getElevatorWeight(i);
			
			ArrayList<Boolean> elevatorPressedButtons = new ArrayList<Boolean>();

			for (int j = 0; j < numberOfFloors; j++) {

				boolean val = controller.getElevatorButton(i, j);
				elevatorPressedButtons.add(val);

			}
			data.addElevatorBox(direction, accl, doorStatus, closestFloor, position, speed, elevatorWeight, capacity, target, elevatorPressedButtons);
		}

		// floor information

		ArrayList<Boolean> floorButtonsDown = new ArrayList<Boolean>();
		ArrayList<Boolean> floorButtonsUp = new ArrayList<Boolean>();

		for (int j = 0; j < numberOfFloors; j++) {

			boolean down = controller.getFloorButtonDown(j);
			boolean up = controller.getFloorButtonUp(j);
			floorButtonsDown.add(down);
			floorButtonsUp.add(up);

		}
		data.setFloorButtonsDown(floorButtonsDown);
		data.setFloorButtonsUp(floorButtonsUp);
		
		currentValue = data;
		notifyObservers(currentValue);
		
	}
}
