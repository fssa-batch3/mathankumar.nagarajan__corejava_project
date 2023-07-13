package day06.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFindTask {

	@Test
	public void testVaildFindTaskByName() {

//		ArrayList<Task> taskList = new ArrayList<Task>();
//		taskList.add(new Task("TT", 10));

//		ArrayList<Task> taskList = FindTheTask.myArray();

		Assertions.assertTrue(FindTheTask.findTaskByName("TP", FindTheTask.myArray()));

	}

	@Test
	public void testInvaildFindTaskByName() {

//		ArrayList<Task> taskList = new ArrayList<Task>();
//		taskList.add(new Task("TQ", 10));

		try {

			FindTheTask.findTaskByName("TQ", FindTheTask.myArray());
			Assertions.fail("Invaild Task Name Failded");

		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Given Task Name Is Not Finded", ex.getMessage());
		}

	}

	@Test
	public void testNullTaskName() {

		try {

			FindTheTask.findTaskByName(null, FindTheTask.myArray());
			Assertions.fail("Invaild Task Name Failded");

		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Task Name is can't be null or empty", ex.getMessage());
		}

	}
	
	@Test
	public void testNullTaskArray() {

		try {

			FindTheTask.findTaskByName("TT", null);
			Assertions.fail("Invaild Task Object Failded");

		} catch (IllegalArgumentException ex) {
			Assertions.assertEquals("Task Object is can't be null or empty", ex.getMessage());
		}

	}

}
