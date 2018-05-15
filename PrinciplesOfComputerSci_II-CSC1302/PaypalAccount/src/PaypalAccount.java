import java.awt.List;

/*Student Name: Yang Li				Date:07/17			Program Name:Paypal
 * Purpose:
 *  Write a PaypalAccount class to include both balance and accountID as the instance variables.  Make sure each instance of this account will have a unique accountID. In other words, different account object should have different accountID (hint: class variable). 
	Write a Bank class with main method. In the main method, ask the user to input how many accounts (say numOfAccount) to be generated in the bank (assuming less than 1000).  Then create an array to hold these numOfAccount of Account objects. For each Account object, generate a random balance in the range of 0.0-1000.0.  
a.	Assume that your GSU campus ID is abc-de-fghi; search the array to see if there is an account with accountID as abc (the first three digits of your campus ID). If there is not an account with accountID as abc, then set the accountID of the last account in the array as abc; transfer all the balance of the first account to the account with accountID of abc
b.	Set the balance of the account with accountID of abc to be efghi/100.0 (i.e., your last 5 digits of your campus ID divided by 100.0);  and print out the information of this account
c.	Find the average account balance of all the accounts in the array and print it out.
d.	Find the account with the largest balance, print out its accountID and balance.
e.	Find the account with the lowest balance, print out its accountID and balance.
 */
public class PaypalAccount {
	private double balance;
	private static int accountID;
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public static int getAccountID() {
		return accountID;
	}

	public static void setAccountID(int accountID) {
		PaypalAccount.accountID = accountID;
	}
}
