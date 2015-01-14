package at.fhhagenberg.sqe.elevator.main;


import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import sqelevator.ElevatorExample;
import sqelevator.IElevator;
import at.fhhagenberg.sqe.elevator.controller.ViewController;
import at.fhhagenberg.sqe.elevator.model.ElevatorObservable;
//comment
import at.fhhagenberg.sqe.elevator.view.View;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			IElevator controller = (IElevator) Naming.lookup("rmi://localhost/ElevatorSim");
			
			final ElevatorObservable client = new ElevatorObservable(controller);

			
			View view = new View();
			ViewController controllerView = new ViewController(view, controller);
			
			client.addObserver(controllerView);
		
			
			Timer timer = new Timer();
			timer.scheduleAtFixedRate(new TimerTask() {
				@Override
				public void run(){
					try {
						client.readValues();
					} catch (RemoteException e) {
						e.printStackTrace();
					}
				}
				
			}, new Date(), 100);
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
			
		

	}

}
