package day07.practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestRemoveDuplicatesUsingHashSet {
	
	@Test
	public void testValidRemoveDuplicateToArray() {
		
		ArrayList<Integer> arrList = new ArrayList<>();
		RemoveDuplicatesUsingHashSet.addvaluetoarray(arrList);
		Assertions.assertTrue(RemoveDuplicatesUsingHashSet.addvaluetoarray(arrList));
		
	}
	
	@Test
	public void testInvalidArrayList() {
		
		try {
			RemoveDuplicatesUsingHashSet.addvaluetoarray(null);
			Assertions.fail("Test Invaild ArrayList Method Is Failded");
		}catch(IllegalArgumentException ex){
			Assertions.assertEquals("ArrayList Cann't be Null", ex.getMessage());
		}
		
	}
	
	@Test
	public void testInvalidHashSet() {
		
		try {
			RemoveDuplicatesUsingHashSet.removeduplicatetoarraylist(null);
			Assertions.fail("Test Invaild HashSet Method Is Failded");
		}catch(IllegalArgumentException ex){
			Assertions.assertEquals("ArrayList Cann't be Null", ex.getMessage());
		}
		
	}

}