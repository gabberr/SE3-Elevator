package at.fhhagenberg.sqe.elevator.main;


import java.awt.Frame;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JOptionPane;

import sqelevator.IElevator;
import at.fhhagenberg.sqe.elevator.controller.ViewController;
import at.fhhagenberg.sqe.elevator.model.ElevatorObservable;
import at.fhhagenberg.sqe.elevator.view.View;
//comment

/**
 * Main class that start the views and connection
 * @author Gaber Setina, S1310455016
 *
 */

public class Main {
	
	private IElevator elevatorInterface;
	ElevatorObservable client;
	View elevatorView;
	ViewController elevatorViewController;
	
	public Main(){

	}
	/**
	 * Start the connection to rmi URL
	 * @throws MalformedURLException
	 * @throws RemoteException
	 * @throws NotBoundException
	 */
	public void connect(String url) throws MalformedURLException, RemoteException, NotBoundException {
		elevatorInterface = (IElevator) Naming.lookup(url);
		client = new ElevatorObservable(elevatorInterface);
		
	}
	
	/**
	 * Start reading the values from the IElevator interface, loads up the gui
	 */
	public void start() {
		elevatorView = new View();
		elevatorViewController= new ViewController(elevatorView, elevatorInterface);
		
		client.addObserver(elevatorViewController);
		
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run(){
				try {
					client.readValues();
//					ele
					
				} catch (RemoteException e) {
					e.printStackTrace();
					
				}
			}
			
		}, new Date(), 100);
		
		
	}
	
	
	public static void main(String[] args) {

		Main main = new Main();
		try {
			main.connect("rmi://localhost/ElevatorSim");
			main.start();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch ( RemoteException e) {
			e.printStackTrace();
		}
		catch (NotBoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
