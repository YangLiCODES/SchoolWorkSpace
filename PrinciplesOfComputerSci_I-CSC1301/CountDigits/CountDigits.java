/*Yang Li
 * 
 * Write a java program called Countdigits that has two method*/
import java.util.Scanner;

public class CountDigits {

	public static void main(String[] args) {
		System.out.println("Student Name is Yang Li");
		System.out.println("Student ID is ");
		Scanner in= new Scanner(System.in);
		System.out.println("Please input a number: ");
		int i =in.nextInt();
		countDigits(i);
	}
	public static void countDigits(int n){
		//calculate how many digits input has
		int a=0;
		int m= n;
		if(m<0){
			m=m*-1;
		}
		else if(m==0){
			m=1;
		}
		while(m>0){
			m=m/10;
			a++;
		}
		System.out.println("There are "+a+" digits in the number of "+n);
	}
}
