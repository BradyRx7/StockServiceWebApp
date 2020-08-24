package edu.bradyreed.advjava.DiDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraderTypeOneTest {

	@Test
	public void testWriteGrades() {
		String grades = "Sam A, Brady A+, Kyle D-, Matt B+";
		GraderInterface grader = new GraderTypeOne();
		grader.writeGrades(grades);
		
		assertTrue("Grader one was used", grader.getGrades().contains("one"));
	}
	
	@Test
	public void testGetGrades() {
		String grades = "Sam A, Brady A+, Kyle D-, Matt B+";
		GraderInterface grader = new GraderTypeOne();
		grader.writeGrades(grades);
		
		assertTrue("Grader one was used", grader.getGrades().contains("one"));
	}
}
