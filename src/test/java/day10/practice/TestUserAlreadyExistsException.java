package day10.practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUserAlreadyExistsException {
	
	User u1 = new User(1, "Mathan", "mathan@gmail.com");
	User u2 = new User(2, "Kumar", "kumar@gmail.com");
	User u3 = new User(3, "Mathankumar", "mathankumar@gmail.com");
	
	@Test
	public void testValidId() {
		Assertions.assertTrue(UserValidator.register(u1));
	}

	
	@Test
	public void testInvalidRegisterInput() {
		try {
			UserValidator.register(null);
			Assertions.fail("Test Invalid Register Input Method Is Failded");
		}catch(UserAlreadyExistsException ex) {
			Assertions.assertEquals("User Object Cann't be Null", ex.getMessage());
		}
	}
	
	@Test
	public void testAddDuplicateUser() {
		try {
			UserValidator.register(u1);
			UserValidator.register(u2);
			UserValidator.register(u1);
			Assertions.fail("Test Add Duplicate User Method Is Failded");
		}catch(UserAlreadyExistsException ex) {
			Assertions.assertEquals("User already added", ex.getMessage());
		}
	}
	
}
