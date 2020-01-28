package edu.westga.cs1301.project1.controllers;

import java.awt.Color;

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
		
		this.bigTurtle.drawRectangleAtLocation(85, 460, 250, 500, Color.black);
		this.bigTurtle.drawEquilateralTriangleAtLocation(85, 460, 300, Color.black);
		this.bigTurtle.drawEquilateralTriangleAtLocation(385, 460, 200, Color.black);
		
		this.littleTurtle.drawRectangleAtLocation(120, 600, 100, 70, Color.black);
		this.littleTurtleDrawWindows();
		this.drawRowofShapes();
		this.bigTurtle.drawHexagonAtLocation(600, 300, 150, Color.yellow);
		moveTurtlesToInitialPosition();	
	}

	private void moveTurtlesToInitialPosition() {
		this.littleTurtle.setLocation(25, 25);
		this.bigTurtle.setLocation(25, 25);
	}

	private void littleTurtleDrawWindows() {
		this.littleTurtle.drawRectangleAtLocation(220, 600, 70, 70, Color.black);
		this.littleTurtle.drawRectangleAtLocation(340, 600, 70, 70, Color.black);
		this.littleTurtle.drawRectangleAtLocation(460, 600, 70, 70, Color.black);
		this.littleTurtle.drawRectangleAtLocation(460, 500, 70, 70, Color.black);
		this.littleTurtle.drawRectangleAtLocation(340, 500, 70, 70, Color.black);
		this.littleTurtle.drawRectangleAtLocation(220, 500, 70, 70, Color.black);
		this.littleTurtle.drawRectangleAtLocation(120, 500, 70, 70, Color.black);
	}
	
	private void drawRowofShapes(){
		this.littleTurtle.drawRectangleAtLocation(500, 750, 70, 70, Color.blue);
		this.littleTurtle.drawEquilateralTriangleAtLocation(380, 810, 80, Color.green);
		this.littleTurtle.drawHexagonAtLocation(300, 810, 50, Color.orange);
		this.littleTurtle.drawEquilateralTriangleAtLocation(200, 810, 80, Color.MAGENTA);
		this.littleTurtle.drawRectangleAtLocation(120, 750, 70, 70, Color.red);
	}
}