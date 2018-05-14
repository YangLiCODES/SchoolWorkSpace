import java.util.Scanner;

/*Student Name: Yang Li
 * Quiz #2
 * Program Purpose:
 * Write a recursive method that test the input string parameter to see if it belongs to this language and return true or false.
 * The L pattern is: A^(2n)B^(n)
 * User's input only return true when:
 * 1.it is an empty string
 * 2.it starts with A followed by a sequence of A's then followed with half as many B's (A should be twice more than B).
 */

public class Q2_YANG_LI {

	
	public static void main(String[] args){
		
		String Word;
		//do while loop to make sure the program won't stop until user enters "no" to exit
		do{
			Scanner input=new Scanner(System.in);
			String str=null;
			System.out.println("Please Enter A String: ");
			
			str=input.nextLine();
			

			boolean result = Lpattern(str);
			System.out.println("");
			System.out.println("If user's input followed L pattern or if it is the empty string the result is \"true\",if not result is \"false\".");
			System.out.println("");
			System.out.println("The Result Is : " + result);

			
		System.out.println("");	
		//ask user if the user wants to repeat the program or not. if the user wants to repeat the program enter "yes" if not enter "no".
		System.out.println("If you want to repeat this program Enter \"yes\" or Enter \"no \"to end this program.");	
		
		
		
		Word=input.next();
		}while(!Word.equalsIgnoreCase("no"));

		
		
		
	}

	//The L pattern is: A^(2n)B^(n)
	
	public static boolean Lpattern (String str){
		//if user 's is empty string return true.
		if(str.isEmpty()){
			return true;
		}
		//check if user's string has 3 letters if not the condition will not meet.
		else if(str.length()%3 != 0){
			return false;
		}
		//check if it follows L pattern or not
		else if(str.charAt(0)== 'A'&&str.charAt(1)== 'A'&&str.charAt(str.length()-1) == 'B' && str.length() == 3){
			return true;
		}
		//if user entered more than 3 characters substring user's string and then check if it follows L pattern
		else if(str.charAt(0)== 'A'&&str.charAt(1)== 'A'&&str.charAt(str.length()-1) == 'B'){
			str = str.substring(2, str.length() - 1);
			return Lpattern(str);
		}
		else {
			return false;	
		}
		
	}

	
	
	
	
	
}
