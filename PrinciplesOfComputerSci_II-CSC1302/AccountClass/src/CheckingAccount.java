// Name yang Li and Zijun Chai			07/06			Program Name:Account
public class CheckingAccount extends Account {
	private int CheckNo;
	
	public CheckingAccount(String name, double balance, int CheckNo) {
		super(name, balance);
		this.CheckNo=CheckNo;
	}
	public int getCheckNo(){
		return CheckNo;
		
	}
	
	public void writeACheckTo(CheckingAccount accB, double amount,int CheckNo){
		accB.deposit(amount);
		withdraw(amount);
		System.out.println("Name: "+getname()+" Balance is: $"+amount+" Check number is "+CheckNo);
	}
	
	
}
