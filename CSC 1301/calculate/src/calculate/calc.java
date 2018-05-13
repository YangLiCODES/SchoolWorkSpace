package calculate;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;
public class calc {

	

	   //operator boolean   
		static boolean isoperator(char ch){
			if (  (ch=='+')||(ch=='-')||(ch=='%')||(ch=='/')||(ch=='*'))
				return true;
			else
				return false;
		}
		
		
		
		
		

		static String topostifx(String infix){
			Stack<Character> operatorstack= new Stack <Character>();
			
			StringBuffer postfix = new StringBuffer();
			
			
			//remove spaces
			infix=infix.trim().replaceAll("\\s+", "");
			
			for(int i =0; i< infix.length();i++){
				char ch= infix.charAt(i);
				
				
				
				
				
				if(Character.isLetter(ch)||(ch==' '))
					postfix.append(" "+ch);
				
				else if (Character.isDigit(ch)){
					while(true){
						ch = infix.charAt(i);
						postfix.append(ch);
						
						
						//check if number is a floating point
						
						if((i<(infix.length()-1))&&(infix.charAt(i+1)=='.')){
							System.out.println("Error in expression!! Cannot accpet floating point numbers.");
						System.exit(1);
						}
						if((i==infix.length()-1)||!Character.isDigit(infix.charAt(i+1))||(infix.charAt(i+1)==' '))
							break;
						else
							i+=1;
					}
					
				}else{				
					switch(ch){
						case '+':
						case '-':
						case '%':
						case '*':
						case '/':	
			while(!operatorstack.isEmpty()){
				if(getprecedence(operatorstack.peek())>=getprecedence(ch)){
					postfix.append(" "+operatorstack.pop());
				}else
					break;
			}
			operatorstack.push(ch);
			break;
			
			
			
			
						case '(':
							operatorstack.push(ch);
							break;
						case ')':
							while(true){
								if(operatorstack.isEmpty()||(operatorstack.peek()=='('))
									break;
								postfix.append(" "+operatorstack.pop());
							}
							
							
							
							if(operatorstack.isEmpty()){
			System.out.println("Error in expression!! Invalid expression.");
			System.exit(1);
		}else{
			while(!operatorstack.isEmpty())
				postfix.append(" "+operatorstack.pop());
		}
		
		return postfix.toString().trim().replace("\\s+", "");
					}
				}
			}
			return infix;
}

			private static int getprecedence(char operator){
						switch(operator){
						case '(':
						case ')':
							return 0;
						case '+':
						case '-':
							return 1;
							
						case '*':
						case '/':
						case '%':
							return 2;
						}
						return operator;
}
		
		//x values
		
		private static int eval(int n1,int n2, char operator){
			int result;
			switch(operator){
			case '+':
				result=n1+n2;
				break;
			case '-':
				result=n1-n2;
				break;
				
			case '*':
				result=n1*n2;
				break;
				
			case '%':
				result=n1%n2;
				break;
				
			case '/':
				result=n1/n2;
				break;
				
			default:
					result=0;
					break;
					
		}
		return result;
	}
		
		
		static int evaluate(String postfix, int x){
			Stack<Integer> valuestack= new Stack<Integer>();
			
			for(int i=0;i<postfix.length();i++){
				char ch=postfix.charAt(i);
						
						switch(ch){
						case '+':
						case '-':
						case '*':
						case '/':
						case '%':
							int n2=valuestack.pop();
							int n1=valuestack.pop();
							valuestack.push(eval(n1,n2,ch));
							break;
							
						case ' ':
							break;
						case 'x':
						case 'X':
							valuestack.push(x);
							break;
							
							default:
								String valuestr=new String();
								while(true){
									valuestr+=postfix.charAt(i);
									if(postfix.charAt(i+1)==' ')
										break;
									else
										i+=1;
								}
								valuestack.push(Integer.valueOf(valuestr));
								break;
						}
			}
			return valuestack.pop();
			
			
			
		}
		
		
		public static void main (String[] args){
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter infix expression: ");
			String infix=sc.nextLine().trim();
			
			
			String postfix= topostifx(infix);
			System.out.println("Converted expression: "+postfix+"\n");
			
			while(true){
				System.out.println("Enter value of x: ");
				if(sc.hasNextInt()){
					int x=sc.nextInt();
					System.out.println("Answer to expression: "+evaluate(postfix,x)+"\n");
				}else
					break;
			
		}
		
		

		}
		
		
}
				
			