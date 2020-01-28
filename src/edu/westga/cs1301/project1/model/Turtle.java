package edu.westga.cs1301.project1.model;

import java.awt.Color;

import acm.graphics.GTurtle;

/**
 * Turtle represents a graphical turtle that can move around on the screen,
 * turn, and raise or lower its tail. When its tail is lowered, it "scratches" a
 * line on the screen that shows the path it takes.
 * 
 * @author CS1301
 * @version Spring 2020
 */
public class Turtle extends GTurtle {

	public static final double INITIAL_SPEED = .6;
	public static final int INITIAL_SIZE = 50;

	private boolean tailDown;
	private int stepsForward;

	/**
	 * Creates a new Turtle object of size 50 at location 0, 0.
	 * 
	 * @precondition none
	 * @postcondition isTailDown() == false AND getTurtleSize() == INITIAL_SIZE
	 *                AND getLocation() == (25, 25) AND getSpeed() ==
	 *                INITIAL_TURTLE_SPEED
	 * 
	 */
	public Turtle() {
		this.initializeWithDefaultValues();	
	}

	/**
	 * 
	 * Creates a new Turtle object of variable size at location 0, 0.
	 * 
	 * @precondition none
	 * @postcondition isTailDown() == false AND size == INITIAL_SIZE
	 *                AND getLocation() == (25, 25) AND getSpeed() ==
	 *                INITIAL_TURTLE_SPEED
	 * 
	 */
	
	public Turtle(int size) {
		this.initializeWithDefaultValues();
		this.setSize(size);
	}

	private void initializeWithDefaultValues() {
		this.setColor(Color.black);
		this.tailDown = false;
		this.stepsForward = 0;
		this.setSize(INITIAL_SIZE);
		this.setSpeed(INITIAL_SPEED);
		this.setLocation(INITIAL_SIZE / 2, INITIAL_SIZE / 2);
	}

	/**
	 * Moves the turtle forward in its current direction by a distance equal to
	 * its own size. The turtle draws a line if its tail is down, but otherwise
	 * just moves.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void stepForward(int maxSteps) {
		for (int counter = 0; counter < maxSteps; counter++) {
			this.forward();
			this.stepsForward++;
		}
	}

	/**
	 * Turns the turtle an inputted number of degrees to its left.
	 *
	 * @precondition none
	 * @postcondition none
	 */
	public void turnLeft(double degree) {
		this.left(degree);
	}

	/**
	 * Turns the turtle an inputted number of degrees to its right.
	 *
	 * @precondition none
	 * @postcondition none
	 */
	public void turnRight(double degree) {
		this.right(degree);
	}


	/**
	 * Drops the turtle's tail to the ground so it will draw a line when it
	 * moves.
	 * 
	 * @precondition none
	 * @postcondition isTailDown() == true
	 */
	public void lowerTail() {
		this.penDown();
		this.tailDown = true;
	}

	/**
	 * Lifts the turtle's tail from the ground so it won't draw a line when it
	 * moves.
	 * 
	 * @precondition none
	 * @postcondition isTailDown() == false.
	 */
	public void raiseTail() {
		this.penUp();
		this.tailDown = false;
	}

	/**
	 * Returns true if the turtle's tail is lowered to the ground, false if it
	 * isn't.
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return true iff the tail is lowered
	 */
	public boolean isTailDown() {
		return this.tailDown;
	}

	/**
	 * Gets the number of steps forward the turtle has taken
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return The total number of steps forward the turtle has taken.
	 */
	
	public int getStepsForward() {
		return this.stepsForward;
	}
	
	/**
	 * The turtles draw a rectangle at a given x,y coordinate with a given width and height
	 * 
	 * @precondition steps must be > 0
	 * @postcondition none
	 * 
	 * @param x coordinate to draw rectangle
	 * @param y coordinate to draw rectangle
	 * @param width of the rectangle
	 * @param height of the rectangle
	 * @param color of the rectangle
	 */
	public void drawRectangleAtLocation(int GoToX, int GoToY, int width, int height, Color color) {	
		this.setLocation(GoToX, GoToY);
		this.setColor(color);
		
		this.lowerTail();
		
		this.stepForward(height/this.getTurtleSize());
		this.turnRight(90);
		this.stepForward(width/this.getTurtleSize());
		this.turnRight(90);

		this.stepForward(height/this.getTurtleSize());
		this.turnRight(90);
		this.stepForward(width/this.getTurtleSize());
		this.turnRight(90);
		
		this.raiseTail();
	}
	
	/**
	 * The turtles draw a rectangle with the given height and width
	 * 
	 * @precondition steps must be > 0
	 * @postcondition none
	 * 
	 * @param x coordinate to draw triangle
	 * @param y coordinate to draw triangle
	 * @param length of the triangle sides
	 * @param color of the triangle
	 */
	
	public void drawEquilateralTriangleAtLocation(int GoToX, int GoToY, int sizeLength, Color color) {
		this.setLocation(GoToX, GoToY);
		this.setColor(color);
		
		this.lowerTail();

		this.stepForward(sizeLength/this.getTurtleSize());
		this.turnLeft(120);
		this.stepForward(sizeLength/this.getTurtleSize());
		this.turnLeft(120);
		this.stepForward(sizeLength/this.getTurtleSize());
		this.turnLeft(120);
		
		this.raiseTail();

	}
	
	/**
	 * The turtles draw a rectangle with the given height and width
	 * 
	 * @precondition steps must be > 0
	 * @postcondition none
	 * 
	 * @param x coordinate of the hexagon
	 * @param y coordinate of the hexagon
	 * @param length of the hexagon sides
	 * @param color of the hexagon
	 */
	
	public void drawHexagonAtLocation(int GoToX, int GoToY, int sizeLength, Color color) {
		this.setLocation(GoToX, GoToY);
		this.setColor(color);
		
		this.lowerTail();

		this.setColor(color);
		this.stepForward(sizeLength/this.getTurtleSize());
		this.turnLeft(60);
		this.stepForward(sizeLength/this.getTurtleSize());
		this.turnLeft(60);
		this.stepForward(sizeLength/this.getTurtleSize());
		this.turnLeft(60);
		this.stepForward(sizeLength/this.getTurtleSize());
		this.turnLeft(60);
		this.stepForward(sizeLength/this.getTurtleSize());
		this.turnLeft(60);
		this.stepForward(sizeLength/this.getTurtleSize());
		this.turnLeft(60);
		
		this.raiseTail();
	}
}
