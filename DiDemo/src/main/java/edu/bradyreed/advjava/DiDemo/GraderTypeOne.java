package edu.bradyreed.advjava.DiDemo;

/**
 * A Simple abstraction of a grader software
 *  
 * @author brady
 *
 */

public class GraderTypeOne implements GraderInterface {
	
	private String completedGrades;
	
	public void writeGrades(String grades) {
		
		this.completedGrades = grades + " entered with grader type one";
	}
	
	public String getGrades() {
		return this.completedGrades;
	}
		
}