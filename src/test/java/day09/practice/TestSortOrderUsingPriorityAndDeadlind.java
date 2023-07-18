package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSortOrderUsingPriorityAndDeadlind {
	
	Task t1 = new Task(3, "Coding", LocalDate.parse("2022-10-22"), 5);
	Task t2 = new Task(5, "Product Design", LocalDate.parse("2022-10-01"), 2);
	Task t3 = new Task(1, "Software Design", LocalDate.parse("2022-10-07"), 3);
	Task t4 = new Task(3, "Writing", LocalDate.parse("2022-10-22"), 1);
	
	List<Task> list = new ArrayList<Task>();
	
	
	@Test
	public void testValidInput() {
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		
		Assertions.assertTrue(SortOrderUsingPriorityAndDeadline.sortTask(list));
		
	}
	
	
	@Test
	public void testInvalidNullArrayList() {
		
		try {
			SortOrderUsingPriorityAndDeadline.sortTask(null);
			Assertions.fail("Test Invalid Null ArrayList Method Has Been Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Task List Can't be Null", ex.getMessage());
		}
		
	}
	
	@Test
	public void testInvalidEmptyArrayList() {
		
		try {
			SortOrderUsingPriorityAndDeadline.sortTask(list);
			Assertions.fail("Test Invalid Empty ArrayList Method Has Been Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Task List Can't be Empty", ex.getMessage());
		}
		
	}

}
