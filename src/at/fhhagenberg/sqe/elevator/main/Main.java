package at.fhhagenberg.sqe.elevator.main;


import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
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
	
	private IElevator controller;
	ElevatorObservable client;
	View view;
	ViewController viewCon;
	
	public Main(){

	}
	
	public void connect() throws MalformedURLException, RemoteException, NotBoundException {
		controller = (IElevator) Naming.lookup("rmi://localhost/ElevatorSim");
		client = new ElevatorObservable(controller);
		
	}
	
	public void start() {
		view = new View();
		viewCon= new ViewController(view, controller);
		
		client.addObserver(viewCon);
		
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
		
		
	}
	
	
	public static void main(String[] args) {

		Main main = new Main();
		try {
			main.connect();
			main.start();
		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		

	}

}
