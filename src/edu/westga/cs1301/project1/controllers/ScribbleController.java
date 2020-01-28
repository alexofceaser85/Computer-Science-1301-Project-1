package edu.westga.cs1301.project1.controllers;

import edu.westga.cs1301.project1.model.Turtle;

/**
 * Uses turtle objects to draw on the screen.
 * 
 * @author CS1301
 * @version Spring 2020
 */
public class ScribbleController {
	private Turtle bigTurtle;
	private Turtle littleTurtle;

	/**
	 * Creates and initializes a new ScribbleController object.
	 * 
	 * @precondition bigTurtle != null AND littleTurtle != null
	 * @postcondition none
	 * 
	 * @param bigTurtle    The bigger of the two turtles
	 * @param littleTurtle The smaller of the two turtles
	 * 
	 */
	public ScribbleController(Turtle bigTurtle, Turtle littleTurtle) {
		this.bigTurtle = bigTurtle;
		this.littleTurtle = littleTurtle;
	}
	
	/**
	 * Draws a house on the screen using turtles.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void draw() {
		
		this.bigTurtle.drawRectangleAtLocation(250, 500, 85, 460);
		this.bigTurtle.drawEquilateralTriangle(300);
		this.bigTurtle.setLocation(385, 460);
		this.bigTurtle.drawEquilateralTriangle(200);
		
		this.littleTurtle.drawRectangleAtLocation(100, 70, 120, 600);
		littleTurtleDrawWindows();
		this.littleTurtle.setLocation(25, 25);
		this.bigTurtle.setLocation(25, 25);
	}


	private void littleTurtleDrawWindows() {
		this.littleTurtle.drawRectangleAtLocation(70, 70, 220, 600);
		this.littleTurtle.drawRectangleAtLocation(70, 70, 340, 600);
		this.littleTurtle.drawRectangleAtLocation(70, 70, 460, 600);
		this.littleTurtle.drawRectangleAtLocation(70, 70, 460, 500);
		this.littleTurtle.drawRectangleAtLocation(70, 70, 340, 500);
		this.littleTurtle.drawRectangleAtLocation(70, 70, 220, 500);
		this.littleTurtle.drawRectangleAtLocation(70, 70, 120, 500);
	}
}