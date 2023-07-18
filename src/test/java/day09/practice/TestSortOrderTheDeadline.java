package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSortOrderTheDeadline {
	
	Task1 t1 = new Task1(3, "Coding", LocalDate.parse("2022-10-22"));
	Task1 t2 = new Task1(5, "Product Design", LocalDate.parse("2022-10-01"));
	Task1 t3 = new Task1(1, "Software Design", LocalDate.parse("2022-10-07"));
	Task1 t4 = new Task1(3, "Coding", LocalDate.parse("2022-10-22"));
	
	List<Task1> list = new ArrayList<Task1>();
	
	
	@Test
	public void testValidInput() {
		
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		Assertions.assertTrue(SortOrderTheDeadline.sortTheTaskArrayList(list));
		
	}
	
	
	@Test
	public void testInvalidNullSortOrder() {
		
		try {
			SortOrderTheDeadline.sortTheTaskArrayList(null);
			Assertions.fail("Test Invalid Null Sort Task Order Method Has Been Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Task List Can't be Null", ex.getMessage());
		}
		
	}

}
