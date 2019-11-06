package BankAccount;

public class SavingsAccount extends Account {

	private double interest;
	private int number;
	private double balance;
	SavingsAccount(int number){
		super(number);
	}
	
	public double addInterest(double interest,double balance) {
		balance=balance+interest/100;
		return balance;
	}
	public double getInterst() {
		return this.interest;
	}
	
	public void setInterest(double interest) {
		this.interest=interest;
	}
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
	}
	
		public void deposit(double sum) {
			if (sum > 0) {
				balance=addInterest(interest,balance)+sum;
			} else {
				System.err.println("Nu putem depozita sume negative!");
			}
		}
	}

