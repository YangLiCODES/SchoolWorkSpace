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
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bank {

	public static void main(String[] args) {
		Scanner console=new Scanner(System.in);
		Random rand=new Random();
		System.out.print("Enter the number of accounts to generate: ");
		int numofAccount=console.nextInt();
		ArrayList<Integer> accountID=new ArrayList<Integer>();//need to change
		//create a arraylist for account ID from 1 too user's input number
		int id;
		for(int j=0;j<numofAccount;j++){
			id=j+1;
			accountID.add(j,id);
		}
		
		//System.out.println(accountID.get(0)); array index from 0 to user's input-1.
		//System.out.println(accountID);		array number from 1 to user's input number.
		
		
		//create an arraylist to hold integer values
		ArrayList<Double> AccountBalance=new ArrayList<Double>();
		
		
		
		double balance;
		double t;
		double c;
		double b;
		for(int i=0;i<numofAccount;i++){
			//gernerate a random number between 0.0 to 1000.0 and add into the array list.
			balance=Math.round((rand.nextDouble()+rand.nextInt(1001))*100.0)/100.0;
			AccountBalance.add(i,balance);
		}
		//My Panther ID is 001-79-6195
		if(accountID.contains(001)){
			AccountBalance.add(0, 96195/100.0);
			
		}
		else{
			t=AccountBalance.get(0);
			c=AccountBalance.get(numofAccount-1);
			
			AccountBalance.add(numofAccount-1,t+c);
			AccountBalance.set(0, 0.0);
		}
		
		System.out.println("\nMy Panther ID is 001-79-6195; My bank account ID is 001 and balance is: $"+AccountBalance.get(0));
		
		//ave
		double sum=0.0;
		double ave;
		for(int x=0;x<numofAccount;x++){
			sum=sum+AccountBalance.get(x);
		}
		ave=Math.round((sum/numofAccount)*100.0)/100.0;
		
		//find the max balance
		double max=AccountBalance.get(0);
		for(int y=0;y<numofAccount;y++){
			if(AccountBalance.get(y)>max){
				max=AccountBalance.get(y);
			}
			
		}

		
		//find the index of the max balance
		int index=0;
		double largest =Integer.MIN_VALUE;
		for(int z=0;z<numofAccount;z++){
			if(AccountBalance.get(z)>largest){
				largest=AccountBalance.get(z);
				index=z;
			}
		}
		index=index+1;
		//System.out.println(AccountBalance);
		//System.out.println(max);
		//System.out.println(index+1);
		
		//find mini balance
		double min=AccountBalance.get(0);
		for(int m=0;m<=numofAccount;m++){
			if(min>AccountBalance.get(m)){
				min=AccountBalance.get(m);
			}
			
		}
		//System.out.println(min);
		//System.out.println(max);
		//find mini index
		int Mindex=0;
		double mini =Integer.MAX_VALUE;
		for(int n=0;n<=numofAccount;n++){
			if(mini>AccountBalance.get(n)){
				mini=AccountBalance.get(n);
				Mindex=n;
			}
		}
		Mindex=Mindex+1;
		//System.out.print(Mindex);
		
		
		System.out.println("\nThe average balance is: $"+ave);
		System.out.println("\nThe account with the largest balance: account ID = "+index+", balance = $"+max);
		System.out.println("\nThe account with the lowest balance: account ID = "+Mindex+", balance = $"+mini);
		
		
		
		console.close();	
	}

}
