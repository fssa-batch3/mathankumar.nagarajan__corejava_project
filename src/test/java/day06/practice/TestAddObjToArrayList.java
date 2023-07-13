package day06.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestAddObjToArrayList {

	@Test
	public void testValidAddTaskToArrayList() {

		Task task = new Task("Read Books", 2);

		Assertions.assertTrue(StoreTaskDetails.addTaskToArrayList(task));

	}
	
	
	@Test
	public void testInvaildNullTaskName() throws IllegalArgumentException {
		
		Task task = new Task(null, 2);
		
		try {
			
			StoreTaskDetails.addTaskToArrayList(task);
			Assertions.fail("Task Name Is Null");
			
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Task Name Cann't be Empty or Null", ex.getMessage());
		}
		
	}
	
	@Test
	public void testInvaildPriority() throws IllegalArgumentException {
		
		Task task = new Task("Read Book", 6);
		
		try {
			
			StoreTaskDetails.addTaskToArrayList(task);
			Assertions.fail("Task Priority is More then 5 or less then 1");
			
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Task Priority must be have 1 to 5", ex.getMessage());
		}
		
	}
	
	

}
