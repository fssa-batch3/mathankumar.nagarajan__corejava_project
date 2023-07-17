package day08.practice;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestDepNameOfEmployees {
	
	public ArrayList<String> userInput() {
		ArrayList<String> depOfEmp = new ArrayList<>();
		depOfEmp.add("HR,Ram");
		depOfEmp.add("HR,Suresh");
		depOfEmp.add("IT,Basker");
		depOfEmp.add("IT,Joseph");
		depOfEmp.add("Admin,Sundar");
		
		return depOfEmp;
	}

	@Test
	public void testValidDepNameOfEmployees() {
		
		
		
		Assertions.assertTrue(DepNameOfEmployees.depnameofemployees(userInput()));
		
	}
	
	
	@Test
	public void testInvalidNullArrayList() {
		
		try {
			DepNameOfEmployees.depnameofemployees(null);
			Assertions.fail("Test Invaild Null ArrayList Method Has been Failded");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Given ArrayList Cann't be Null", ex.getMessage());
		}
		
	}
	
	
	@Test
	public void testInvalidNullStringInArrayList() {
		
		try {
			
			ArrayList<String> n1 = userInput();
			n1.add(null);
			
			DepNameOfEmployees.depnameofemployees(n1);
			Assertions.fail("Test Invalid Null String In ArrayList Method Has been Faildee");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Input cann't be Empty or Null", ex.getMessage());
		}
		
	}
	
	@Test
	public void testInvalidEmptySpaceStringInArrayList() {
		
		try {
			
			ArrayList<String> n1 = userInput();
			n1.add(" ");
			
			DepNameOfEmployees.depnameofemployees(n1);
			Assertions.fail("Test Invalid Empty Space String In ArrayList Method Has been Faildee");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Input cann't be Empty or Null", ex.getMessage());
		}
		
	}
	
	
	@Test
	public void testInvalidSpltedArrayList() {
		
		try {
			
			ArrayList<String> n1 = userInput();
			n1.add("HR,Mathan,kumar");
			
			DepNameOfEmployees.depnameofemployees(n1);
			Assertions.fail("Test Invalid Splted ArrayList Method Has been Faildee");
		}catch(IllegalArgumentException ex) {
			Assertions.assertEquals("Input Must hava Department and the Employee Name", ex.getMessage());
		}
		
	}
	
}
