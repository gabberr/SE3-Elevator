package at.fhhagenberg.sqe.elevator.controller;

import at.fhhagenberg.sqe.elevator.view.View;

public class Controller {
	View view = null;
	
	public Controller(View view){
		this.view = view;
	}
}
