package files;
import java.util.*;
import java.io.*;
import java.lang.*;

public class files {
	//check file
	public void checkFile(){
	File x = new File("create.txt");
	if(x.exists()){
		System.out.println("File exist!");
	}else{
		System.out.println("File not exist!");
	}
}
Formatter y;//create file
public void createFile(){
	try{
		y = new Formatter("create.txt");
	}catch(Exception e){
		System.out.println("cannot create file.");
	}
	y.format("%s %s %s", "I", "AM", "Chinese.");
	y.close();
}

Scanner z;//read file
public void readFile(){
	try{
		z = new Scanner(new File("create.txt"));
	}catch(Exception e){
		System.out.println("Cannot create the files.");
	}
	while(z.hasNext()){
		String a = z.next();
		String b = z.next();
		String c = z.next();
		System.out.println(a+" "+b+" "+c);
	}
	z.close();
}
public static void main(String[] args){
	files obj = new files();
	obj.checkFile();
	obj.createFile();
	obj.readFile();
}

}
