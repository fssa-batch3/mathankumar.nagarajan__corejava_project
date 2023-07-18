package day09.practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestSortListOfIntegers {
	
	ArrayList<Integer> intList = new ArrayList<Integer>();
	
	@Test
	public void testValidInput() {
		Assertions.assertTrue(SortListOfIntegers.addIntegerToArray(intList));
	}
	
	@Test
	public void testInvalidNullInput() {
		
		try {
			SortListOfIntegers.addIntegerToArray(null);
			Assertions.fail("Test Invalid Null Input Mathod Has been Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("ArrayList Can't be Null", ex.getMessage());
		}
		
	}
	
	

}
