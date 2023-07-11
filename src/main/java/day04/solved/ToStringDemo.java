package day04.solved;

// Solved 4

class Account4 {

	private String accNo;

	private String name;

	private double balance;

	// Default Constructor
	public Account4() {

	}

	// Creating a Constructor which accepts all the attributes: Constructor
	// Overloading
	public Account4(String accNo, String name, double balance) {
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}


}


public class ToStringDemo {
	public static void main(String[] args) {
		// create Account using Setter methods and Default constructor
		Account4 acct1 = new Account4();
		acct1.setAccNo("A101");
		acct1.setName("Naresh");
		acct1.setBalance(1000);
		
		System.out.println(acct1.getAccNo());
		
		// Create Account using toString Method
		
		Account3 acct2 = new Account3("A0097", "Mathan", 2000);
		System.out.println(acct2.toString());
	}

}