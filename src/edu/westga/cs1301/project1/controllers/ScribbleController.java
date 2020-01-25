package edu.westga.cs1301.project1.controllers;

import edu.westga.cs1301.project1.model.Turtle;
import edu.westga.cs1301.project1.utils.Statistics;

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
	 * @param bigTurtle
	 *            The turtle that will increase in size.
	 * @param littleTurtle
	 *            The turtle that will decrease in size.
	 * 
	 */
	public ScribbleController(Turtle bigTurtle, Turtle littleTurtle) {
		this.bigTurtle = bigTurtle;
		this.littleTurtle = littleTurtle;
		
		this.bigTurtle.increaseTurtleSizeBy10();
		
		this.littleTurtle.decreaseTurtleSizeBy10();
		this.littleTurtle.decreaseTurtleSizeBy10();
		this.littleTurtle.decreaseTurtleSizeBy10();
	}

	/**
	 * Draws a figure on the screen using turtles.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void draw() {
		this.moveBigTurtleToPositionForFirstRectangle();
		this.moveLittleTurtleToPositionForFirstRectangle();

		this.drawRectangleWithBigTurtle();
		this.drawRectangleWithLittleTurtle();

		this.moveBigTurtleToPositionForSecondRectangle();
		this.moveLittleTurtleToPositionForSecondRectangle();

		this.drawRectangleWithBigTurtle();
		this.drawRectangleWithLittleTurtle();
		
	}

	private void stepForward(Turtle aTurtle, int steps) {
		for (int i = 0; i < steps; i++) {
			aTurtle.stepForward();
		}

	}

	private void moveLittleTurtleToPositionForSecondRectangle() {
		this.stepForward(this.littleTurtle, 21);
	}

	private void drawRectangleWithLittleTurtle() {
		this.littleTurtle.lowerTail();
		this.stepForward(this.littleTurtle, 7);
		this.littleTurtle.turnRight90();
		this.stepForward(this.littleTurtle, 15);
		this.littleTurtle.turnRight90();
		
		this.stepForward(this.littleTurtle, 7);
		this.littleTurtle.turnRight90();
		this.stepForward(this.littleTurtle, 15);
		this.littleTurtle.turnRight90();

		this.littleTurtle.raiseTail();
	}

	private void moveBigTurtleToPositionForSecondRectangle() {
		this.stepForward(this.bigTurtle, 7);
	}

	private void drawRectangleWithBigTurtle() {
		this.bigTurtle.lowerTail();

		this.stepForward(this.bigTurtle, 5);
		this.bigTurtle.turnRight90();
		
		this.stepForward(this.bigTurtle, 7);
		this.bigTurtle.turnRight90();

		this.stepForward(this.bigTurtle, 5);
		this.bigTurtle.turnRight90();
		
		this.stepForward(this.bigTurtle, 7);
		this.bigTurtle.turnRight90();
		
		this.bigTurtle.raiseTail();
	}

	private void moveBigTurtleToPositionForFirstRectangle() {
		this.bigTurtle.stepForward();
		this.bigTurtle.turnRight90();
		this.bigTurtle.stepForward();
		this.bigTurtle.turnLeft90();
	}

	private void moveLittleTurtleToPositionForFirstRectangle() {
		this.stepForward(this.littleTurtle, 7);
		this.littleTurtle.turnRight90();
		this.stepForward(this.littleTurtle, 3);
		this.littleTurtle.turnLeft90();
	}


}