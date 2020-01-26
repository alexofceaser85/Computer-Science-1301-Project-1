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
	 * Draws a figure on the screen using turtles.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void draw() {
		this.bigTurtle.setLocation(85, 85);
		this.littleTurtle.setLocation(165, 85);

		this.drawRectangleWithBigTurtle();
		this.drawRectangleWithLittleTurtle();

		this.bigTurtle.setLocation(505, 85);
		this.littleTurtle.setLocation(585, 85);

		this.drawRectangleWithBigTurtle();
		this.drawRectangleWithLittleTurtle();
	}

	private void drawRectangleWithLittleTurtle() {
		this.littleTurtle.lowerTail();
		this.littleTurtle.stepForward(7);
		this.littleTurtle.turnRight(90);
		this.littleTurtle.stepForward(15);
		this.littleTurtle.turnRight(90);

		this.littleTurtle.stepForward(7);
		this.littleTurtle.turnRight(90);
		this.littleTurtle.stepForward(15);
		this.littleTurtle.turnRight(90);

		this.littleTurtle.raiseTail();
	}

	private void drawRectangleWithBigTurtle() {
		this.bigTurtle.lowerTail();

		this.bigTurtle.stepForward(5);
		this.bigTurtle.turnRight(90);

		this.bigTurtle.stepForward(7);
		this.bigTurtle.turnRight(90);

		this.bigTurtle.stepForward(5);
		this.bigTurtle.turnRight(90);
		this.bigTurtle.stepForward(7);
		this.bigTurtle.turnRight(90);

		this.bigTurtle.raiseTail();
	}

}