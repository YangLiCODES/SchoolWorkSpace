// Name yang Li and Zijun Chai			07/06			Program Name:Account
public class BankClass {
	public static void main(String[] args){
		Account n1= new Account("tom", 1000);
		n1.deposit(1000.0);
		n1.withdraw(500.0);
		n1.displayBalance();
		
		
		SavingAccount n2=new SavingAccount("jon",2000,0.03);
		
		n2.CalculateInterest();
		
		
		CheckingAccount n3=new CheckingAccount("sam",2000,1);
		CheckingAccount n4=new CheckingAccount("mark",2000,2);
			
		n3.writeACheckTo(n4,2000,1);
	}
}