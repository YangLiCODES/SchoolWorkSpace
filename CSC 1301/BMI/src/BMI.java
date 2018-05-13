import java.util.Scanner;
//lab#2	write a java program name BMI.java
public class BMI {

	public static void main(String[] args) {
		System.out.println("");
		Scanner in= new Scanner(System.in);
		double weight=0;
		boolean b=true;
		//if the user input a number the the system console the number 
		//if the user input a letter system printout enter again
		System.out.println("Entert your weight:");
		while(b){
			try{
				weight=in.nextDouble();
				b=false;
			}
			catch(Exception e){
				System.out.println("Please enter again:");
				in.nextLine();
			}
		}
		double height=0;
		boolean c=true;
		System.out.println("Entert your height:");
		while(c){
			try{
				height=in.nextDouble();
				c=false;
			}
			catch(Exception e){
				System.out.println("Please enter again:");
				in.nextLine();
			}
		}
		//calculate BMI
		double BMI;
		BMI=weight/(height*height)*703.0;
		if(BMI<18.5){
			System.out.println("Underweight");
		}
		else if (BMI<=24.9){
			System.out.println("Normal");
		}
		else if (BMI<=29.9){
			System.out.println("Overweight");
		}
		else{
			System.out.println("Obese");
		}
	}
}
