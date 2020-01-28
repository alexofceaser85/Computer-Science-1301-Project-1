package edu.westga.cs1301.project1.controllers;

import edu.westga.cs1301.project1.model.Turtle;
import edu.westga.cs1301.project1.utils.Statistics;

/**
 * Computes and displays basic statistics about the turtles
 * 
 * @author CS1301
 * @version Spring 2020
 */
public class StatisticsController {
	
	private Turtle turtle1;
	private Turtle turtle2;

	/**
	 * Creates a statistics controller
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public StatisticsController() {
		this.turtle1 = null;
		this.turtle2 = null;
	}
	
	/**
	 * Creates a statistics controller that will use the two specified turtles.
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public StatisticsController(Turtle turtle1, Turtle turtle2) {
		this.turtle1 = turtle1;
		this.turtle2 = turtle2;
	}
	
	/**
	 * Gets the total steps forward for the turtle passed through the parameter
	 
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return The total amount of steps of the turtle
	 */
	
	Statistics stats = new Statistics();
	public int getTurtleSteps(Turtle turtle) {
		return ((Turtle) turtle).getStepsForward();
	}
	
	/**
	 * Gets the average steps for the turtles
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @return the average steps for the two turtles
	 */
	
	public double getAverageSteps() {
		return stats.computeAverage(getTurtleSteps(turtle1), getTurtleSteps(turtle2));
	}
	
	/**
	 * Gets the standard steps of the turtle passed through the parameter
	 * @return the standard steps for the turtles
	 * 
	 * @precondition none
	 * @postcondition none
	 * 
	 * @param the turtle that you want to find the standard steps of
	 */
	
	public double getStandardSteps(Turtle turtle) {
		return stats.computeStandard(turtle);
	}

	/**
	 * Prints the statistics of the turtle to the console
	 * 
	 * @precondition none
	 * @postcondition none
	 */
	public void printSummaryStats() {
		
		System.out.println("Turtle stats: "
				+ "\n "
				+ "\n"
				+ "Steps taken by:"
				+ "\n"
				+ "First turtle: " + getTurtleSteps(turtle1)
				+ "\n"
				+ "Second turtle: " + getTurtleSteps(turtle2)
				+ "\n"
				+ "Average steps taken by both turtles: " + getAverageSteps()
				+ "\n"
				+ "\n"
				+ "Standard turtle steps traveled by:"
				+ "\n"
				+ "First turtle: " + getStandardSteps(turtle1)
				+ "\n"
				+ "Second turtle: " + getStandardSteps(turtle2));
	}
}
