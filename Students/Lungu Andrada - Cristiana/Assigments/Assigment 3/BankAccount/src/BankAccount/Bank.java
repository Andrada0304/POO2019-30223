package BankAccount;

public class Bank {
	public  void  UpdateMethod() {
		SavingsAccount sv= new SavingsAccount(5000);
		sv.setBalance(sv.addInterest(10, 10000));
		System.out.println("SavingsAccount balance="+sv.getBalance());
		CurrentAccount ca=new CurrentAccount(5000);
		ca.setLimit(10000);
		//Account a=new Account(5000);
		while(sv.getBalance()<ca.getLimit()) {
			sv.setBalance(sv.getBalance()+sv.getBalance());
			System.out.println(sv.getBalance());
		}
		if (sv.getBalance()>ca.getLimit()) {
			System.out.println("Ati depasit limita maxima");
		}
		
	}
	
	public void OpenAccount() {
		Account a=new Account(1);
	}
	
	public void Dividend() {
		SavingsAccount sv=new SavingsAccount(1);
		sv.setInterest(10);
		sv.setBalance(sv.addInterest(sv.getInterst(), 0));
		double dividen=12.0;
		sv.addInterest(dividen,sv.getBalance());
	}
	
	public void CloseAccount() {
		Account a=new Account(1);
		a.deposit(1000);
		a.withdraw(1000);
	}
	
	public static void main(String[] args) {
		double array[]= new double[6];
		Account a=new Account(10000);
		array[0]=a.getAccountNumber();
		a.deposit(500);
		array[1]=a.getBalance();
		SavingsAccount sv=new SavingsAccount(5000);
		sv.setInterest(6.0);
		array[2]=sv.getInterst();
	//	sv.deposit(100);
		sv.setBalance(sv.addInterest(sv.getInterst(), 5000.0));
		array[3]=sv.getBalance();
		CurrentAccount ca=new CurrentAccount(200);
		ca.setLimit(1000000);
		array[4]=ca.getLimit();
		ca.setBalance(5000);
		array[5]=ca.getBalance();
		for(int i=0;i<6;i++)
			System.out.println(array[i]+" ");
		
	}
}
