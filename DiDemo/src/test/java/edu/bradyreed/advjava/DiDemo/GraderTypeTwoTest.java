package edu.bradyreed.advjava.DiDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraderTypeTwoTest {

	@Test
	public void testWriteGrades() {
		String grades = "Sam A, Brady A+, Kyle D-, Matt B+";
		GraderInterface grader = new GraderTypeTwo();
		grader.writeGrades(grades);
		
		assertTrue("Grader two was used", grader.getGrades().contains("two"));
	}
	
	@Test
	public void testGetGrades() {
		String grades = "Sam A, Brady A+, Kyle D-, Matt B+";
		GraderInterface grader = new GraderTypeTwo();
		grader.writeGrades(grades);
		
		assertTrue("Grader two was used", grader.getGrades().contains("two"));
	}
}
