package day12.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import day11.practice.DAOException;

public class TestTaskDAO2 {

	@Test
	public void testValidCreateTask() throws DAOException {

		Task t1 = new Task();
		t1.name = "Day12 Practice";
		t1.status = "Completed";

		Assertions.assertTrue(TaskDAO2.createTask(t1));

	}

	@Test
	public void testInvalidTaskName() throws DAOException {

		try {
			Task t2 = new Task();
			t2.name = "";
			t2.status = "Completed";
			TaskDAO2.createTask(t2);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Task name can't be null or empty", ex.getMessage());
		}

	}

	@Test
	public void testInvalidTaskStatus() throws DAOException {

		try {
			Task t2 = new Task();
			t2.name = "Push Code To Github";
			t2.status = null;
			TaskDAO2.createTask(t2);
		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Task Status Can't Be Null or Empty", ex.getMessage());
		}

	}
	
	@Test
	public void testInvalidUpdateTaskId() throws DAOException {
		try {
			Task t1 = new Task();
			t1.id = -1;
			t1.name = "Charge Phone";
			t1.status = "Completed";
			TaskDAO2.updateTask(t1);
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Task Id conn't be 0 or less then 0", ex.getMessage());
		}
	}
	
	@Test
	public void testInvalidDeleteTaskId() throws DAOException {
		try {
			TaskDAO2.deleteTask(-1);
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Task Id conn't be 0 or less then 0", ex.getMessage());
		}
	}
	
	@Test
	public void testValidUpdateTask() throws DAOException {
		Task t1 = new Task();
		t1.id = 1;
		t1.name = "Task";
		t1.status = "Pending";
		Assertions.assertTrue(TaskDAO2.updateTask(t1));
	}
	
	@Test
	public void testValidDeleteTask() throws DAOException {
		Assertions.assertTrue(TaskDAO2.deleteTask(1));
	}

	

}
