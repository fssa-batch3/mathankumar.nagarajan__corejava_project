package day08.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUsingHashMapToCountTheNames {
	
	@Test
	public void testValidString() {
		
		String strNames = "Ram, Ram, Superman, Spider, hey, hello, hey, Spider";
		
		Assertions.assertTrue(UsingHashMapToCountTheNames.splitarraylist(strNames));
		
	}
	
	
	@Test
	public void testInvalidSplitArrayList() {
		
		try {
			UsingHashMapToCountTheNames.splitarraylist(null);
			Assertions.fail("Test Invalid Splited ArrayList Method Has Been Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Given Names String Cann't be Empty or Null", ex.getMessage());
		}
		
	}
	
	
	@Test
	public void testInvalidAddListToHashMap() {
		
		try {
			UsingHashMapToCountTheNames.addlistusinghashmap(null);
			Assertions.fail("Test Invalid AddList Using HashMap Method Has Been Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Spited String Array Cann't be Null", ex.getMessage());
		}
		
	}
	
	
	@Test
	public void testInvalidGetPrintStatement() {
		
		try {
			UsingHashMapToCountTheNames.getoutput(null);
			Assertions.fail("Test Invalid Print Statement Method Has Been Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("HashMap ArrayList Cann't be Null", ex.getMessage());
		}
		
	}

}
