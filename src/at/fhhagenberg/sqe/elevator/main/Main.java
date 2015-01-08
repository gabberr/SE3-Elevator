package at.fhhagenberg.sqe.elevator.main;


import at.fhhagenberg.sqe.elevator.controller.ViewController;
//comment
import at.fhhagenberg.sqe.elevator.view.View;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		View view = new View();
		ViewController controller = new ViewController(view);
	}

}
