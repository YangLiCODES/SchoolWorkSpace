package pyjah.util.pkg;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.*;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


/*
 * Class for creating a new user.  As of right now there are some fields which I think may
 * be unneccesary or misplaced or unused in this class (inbox, sentbox) but maybe not.  Lets
 * share ideas on next team meeting.  
 */
public class User {
	private static String username;
	private static String password;
	private static HashMap inbox;
	private static HashMap sentBox;
	private Email email;
	
	public User() {
		
	}

	public User(String username, String password, HashMap inbox, HashMap sentBox) {
		this.username = username;
		this.password = password;
		this.inbox = inbox;
		this.sentBox = sentBox;
	}
	
	public User(String username) {
		this.username = username;
	}
	
	public User(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public User(String username, HashMap inbox, HashMap sentBox) {
		this.username = username;
		this.inbox = new HashMap(inbox);
		this.sentBox = new HashMap(sentBox);
	}
	
	public String getUsername() {
		return username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public HashMap getInbox() {
		return inbox;
	}
	
	public HashMap getSentBox() {
		return sentBox;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setInbox(HashMap inbox) {
		this.inbox = inbox;
	}
	
	public void setSentBox(HashMap sentBox) {
		this.sentBox = sentBox;
	}
	
	public String toString() {
		return "User Name: " + username + "\nPassword: " + password;
	}

	public HashMap inbox(HashMap map) {
		HashMap hmap = new HashMap();
		return hmap;
	}
	
	
	 public void sendEmail(Email email, ObjectOutputStream output){
	        try{
	            output.writeObject(email);
	            output.flush();
	        }catch(IOException ioException){
	            System.out.println("\n Oops! Something went wrong!");
	        }
	    }


}
