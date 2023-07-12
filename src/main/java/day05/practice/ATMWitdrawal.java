package day05.practice;

/*
 * Task#1: Create an AxisATM implementation which will have withdrawal charges of 5 rupees. 
 * If the balance is less than 5000, the withdraw method should throw and exception

Task#2: Create an IciciATM implementation which will have withdrawal charges of 10 rupees.

If the balance is less than 10000, the withdraw method should throw and exception

Implement the Deposit method which is common for all the Banks.
 */
//Change the below class to have setters and Getters and Constructors
class Account {
	String accNo;
	double balance;

	public Account(String accNo, double balance) {
		this.accNo = accNo;
		this.balance = balance;
	}

	public String getAccNo() {
		return accNo;
	}

	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}

interface ATM {
	boolean deposit(Account account, double amount);

	boolean withdraw(Account account, double amount) throws Exception;

	double getBalance();
}

class AxisATM implements ATM {

	@Override
	public boolean deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		account.balance += amount;
		return true;

	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		// TODO Auto-generated method stub
		if (account.balance < 5000) {
			throw new Exception("Your account balance is less than 5000 you should have mininmum balance to withdraw");

		}
		double amountwithdraw = amount + 5;

		if (account.balance >= amountwithdraw) {

			account.balance -= amountwithdraw;

			return true;
		} else {
			throw new Exception("Your account balance is less than 5000 you should have mininmum balance to withdraw");

		}

	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.getBalance();
	}

}

//  IciciATM 

class IciciATM implements ATM {

	@Override
	public boolean deposit(Account account, double amount) {
		// TODO Auto-generated method stub
		account.balance += amount;
		return true;

	}

	@Override
	public boolean withdraw(Account account, double amount) throws Exception {
		// TODO Auto-generated method stub
		if (account.balance < 10000) {
			throw new Exception("Your account balance is less than 10000 you should have mininmum balance to withdraw");

		}

		double amountwithdraw = amount + 10;

		if (account.balance >= amountwithdraw) {

			account.balance -= amountwithdraw;

			return true;
		} else {
			throw new Exception("Your account balance is less than 10000 you should have mininmum balance to withdraw");

		}

	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return this.getBalance();
	}

}

// test
public class ATMWitdrawal {
	public static void main(String[] args) {
		// 1
		Account axisaccount = new Account("Ax8940", 10000);
		ATM axisAtm = new AxisATM();

		try {
			axisAtm.withdraw(axisaccount, 2000);
			System.out.println("Current Balance: " + axisaccount.getBalance());
		} catch (Exception e) {

			System.out.println("Error" + e.getMessage());
		}

		// 2

		Account iciciATMaccount = new Account("ICI432", 10000);
		ATM iciciATM = new IciciATM();

		try {
			iciciATM.withdraw(iciciATMaccount, 2000);
			System.out.println("Current Balance: " + iciciATMaccount.getBalance());
		} catch (Exception e) {

			System.out.println("Error" + e.getMessage());
		}

		axisAtm.deposit(axisaccount, 2000);
		System.out.println("Your account balance after deposited " + axisaccount.getBalance());

		iciciATM.deposit(iciciATMaccount, 2000);
		System.out.println("Your account balance after deposited " + iciciATMaccount.getBalance());

	}

}