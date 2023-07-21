package day12.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day11.practice.DAOException;

public class TestTaskDAO2 {
	
	@Test
	public void testValidConnection() {
		
	}
	
	
	@Test
	public void testValidCreateTask() throws DAOException {
		
		Task t1 = new Task();
		t1.name = "Day12 Practice";
		t1.status = "Completed";
		
		Assertions.assertTrue(TaskDAO2.createTask(t1));
		
	}

}
