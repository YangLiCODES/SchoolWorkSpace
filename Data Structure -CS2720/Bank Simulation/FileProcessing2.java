

import java.io.File;
import java.io.PrintWriter;
import java.util.*;
//count words,lines in the file
public class FileProcessing2 {
	
	public static void main(String[] args) {
		//create the file
		File file = new File("test.txt");
		
		try{
			PrintWriter output= new PrintWriter(file);
			output.println("My name is Shubin WU,");
			output.println("and my age is 24.");
			output.close();
		}catch(Exception e){
			System.out.printf("Error: \n",e);
		}
		//read the file and count it
		int words=0;
		int lines=0;
		int chars=0;
		
		
		try{
			Scanner input = new Scanner(file);
			while(input.hasNextLine()){
				lines++;
				String s = input.nextLine();
				chars+=s.replaceAll(" ","").length();
				words+=s.split("\\s+").length;
			}

			System.out.println(lines+" " +chars+" "+words);
			input.close();
		
		}catch(Exception e){
			System.out.println("Error occurs");
		}
		

	}

}