// Name yang Li and Zijun Chai			07/06			Program Name:Account
public class Account {

	private String name;
	private double balance;
	
	public Account(String name, double balance){
		this.name=name;
		this.balance=balance;
	}
	public String getname(){
		return name;
	}
	public double getbalance(){
		return balance;
	}

		public void deposit(double amount) {
		balance = balance + amount;
	}
		public void withdraw(double amount){
			balance=balance-amount;
		}
	public void displayBalance(){
			System.out.println(name+", balance is: $"+balance);
	}
}
