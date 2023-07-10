package day03.practice;


class User{
	
	public String name;
	public String password;
	public String emailId;
	
	public User() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public User(String name, String password, String emailId) {
		this.name = name;
		this.password = password; 
		this.emailId = emailId;
	}
	
}



public class UserAccount {

	public static void main(String[] args) {
		
		User u1 = new User();
		u1.setName("Mathankumar");
		u1.setPassword("Mathan@123");
		u1.setEmailId("kumarmadhan432@gmail.com");
		
		System.out.println("Name: " + u1.getName() + ", Password: " + u1.getPassword() + ", Email Id: " + u1.getEmailId());
		
		User u2 = new User("Mathankumar", "Mathan@123", "kumarmadhan432@gmail.com");
		
		System.out.println("Name: " + u2.name + ", Password: " + u2.password + ", Email Id: " + u2.emailId);
		
	}
	
}
