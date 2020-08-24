package edu.bradyreed.advjava.DiDemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TeacherTest {

	@Test
	public void testTeacherGraderOne() {
			String grades = "Sam A, Brady A+, Kyle D-, Matt B+";
			GraderInterface grader = new GraderTypeOne();
			Teacher alice = new Teacher(grader, grades);
			
			assertTrue("Grader one was used", grader.getGrades().contains("one"));
		
	}
	
	@Test
	public void testTeacherGraderTwo() {
			String grades = "Sam A, Brady A+, Kyle D-, Matt B+";
			GraderInterface grader = new GraderTypeTwo();
			Teacher mike = new Teacher(grader, grades);
			
			assertTrue("Grader two was used", grader.getGrades().contains("two"));
		
	}
}
