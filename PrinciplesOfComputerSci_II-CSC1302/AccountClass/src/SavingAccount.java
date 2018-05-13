// Name yang Li and Zijun Chai			07/06			Program Name:Account
public class SavingAccount extends Account {

		private double rate;

		public double getRate(){
			return rate;
		}
		public SavingAccount(String name, double balance, double rate) {
			super(name, balance);
			this.rate=rate;
		}
		public void CalculateInterest(){
			
			double earned=getbalance()*rate;
			
			System.out.println("The Interests earned in one year is: $ "+earned);
		}
		
		
}
