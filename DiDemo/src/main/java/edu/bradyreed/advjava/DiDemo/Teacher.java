package edu.bradyreed.advjava.DiDemo;

/**
 * A Class representing a teacher that uses grading software to enter grades
 *	
 *	This is a simple DI example that allows the teacher to use two different
 *	grading softwares
 * 
 * @author brady
 */

public class Teacher {
	
	public Teacher(GraderInterface grader, String grades) {
		grader.writeGrades(grades);
	}
}


