package BankAccount;

public class CurrentAccount extends Account{
	private double limit;
	private int number;
	private double balance;
	CurrentAccount(int number){
		super(number);
	}

	public double getLimit() {
		return this.limit;
	}
	public void setLimit(double limit) {
		this.limit=limit;
	}
	public void deposit(double sum) {
		if (sum > 0) {
			if (sum<limit) {
				balance += sum;
			} else
			{
				System.err.println("Ati atins limita maxima!");
			}

		} else {
			System.err.println("Nu puteti depozita sume negative");
		}
}
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance=balance;
		
	}
}
