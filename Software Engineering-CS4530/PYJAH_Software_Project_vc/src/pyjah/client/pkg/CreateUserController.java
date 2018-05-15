package pyjah.client.pkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;


/*
 * Controller for the "new user" scene.  This will handle logic and field proccessing as well
 * as create new user object.  
 * 
 */


public class CreateUserController implements Initializable {
	
	
	@FXML private TextField usernameLine;
	@FXML private TextField passwordLine;
	@FXML private Button createAccount;
	Client pyjahClient = new Client();
	
	//method that switches scenes on the "create user" button click.  Still needs 
	// to add logic for existing user error and sending fields to the txt file
	public void handleCreateUserButtonClick(ActionEvent event) throws IOException {
		//newUserFieldsHandler(usernameLine, passwordLine);
	
		
		pyjahClient.sendMessage(usernameLine.getText());
		pyjahClient.sendMessage(passwordLine.getText());

		usernameLine.clear();
		passwordLine.clear();
		/*Parent loginViewParent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
		Scene loginViewScene = new Scene(loginViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(loginViewScene);
		window.show();*/
		
	}
	
	public void handleGoBackLinkClick(ActionEvent event) throws IOException {
		Parent loginViewParent = FXMLLoader.load(getClass().getResource("LoginView.fxml"));
		Scene loginViewScene = new Scene(loginViewParent);
		
		Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
		
		window.setScene(loginViewScene);
		window.show();
		
	}
	
	
	//This is the method which retrieves input from new user text fields
	public void newUserFieldsHandler(TextField usernameLine, TextField passwordLine) {
		String username = usernameLine.getText();
		String password = passwordLine.getText();
		
		User user = new User(usernameLine.getText(), passwordLine.getText());
		
		
		//print username and password
		sendUserInfo(user);
		
		
		
	}
	
	
	// a simple print out of the new user "username/password" fields
	public void sendUserInfo(User user) {
		System.out.println(user.toString());
	}
	
	public Client getConnection(Client pyClient) {
		return pyClient;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
