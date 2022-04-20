package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class MainController {
	//========================================================Variable Declaration=============================================================//
	
		//Welcome
	@FXML
	public Button Customer;
	
	@FXML
	public Button Owner;
	
	@FXML
	public Button Customer_Signup;
	
	@FXML
	public Button Customer_Register;
	
	
	@FXML
	public Button Owner_Signup;
	
	@FXML
	public Button Owner_Register;
	
	

	@FXML
	public Button b_signup;
	
	@FXML
	public Button Business_Register;
	
	@FXML
	public Button C_Home;
	
	@FXML
	public Button O_Home;
	
	
	@FXML
	public Button View_Sales;
	
	
	
	@FXML
	public TextField Username;
	@FXML
	public TextField Password;
	@FXML
	public Label DisplayCorrect;
	
		//Main Menu
	

	//private Stage stage;
	//private Scene scene;
	//private Parent root;
	
	
	
	
	//====================================================LogIn==========================================================================/
	
	@FXML
	 public void Login() throws Exception 
		{
		
		
		Stage stage = (Stage) Customer.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("Login.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
		 
		 
		 
	    }
	
	@FXML
	 public void Login_Owner() throws Exception 
		{
		
		
		Stage stage = (Stage) Owner.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("Login_Owner.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	@FXML
	 public void customer_signup() throws Exception 
		{
		
		
		Stage stage = (Stage) Customer_Signup.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("customer_signup.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	@FXML
	 public void C_signup_success() throws Exception 
		{
		
		
		Stage stage = (Stage) Customer_Register.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("c_register_success.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	
	@FXML
	 public void owner_signup() throws Exception 
		{
		
		
		Stage stage = (Stage) Owner_Signup.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("owner_signup.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	@FXML
	 public void O_signup_success() throws Exception 
		{
		
		
		Stage stage = (Stage) Owner_Register.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("o_register_success.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	@FXML
	 public void Business_Register() throws Exception 
		{
		
		
		Stage stage = (Stage) Business_Register.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("business_register.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	@FXML
	 public void B_signup_success() throws Exception 
		{
		
		
		Stage stage = (Stage) b_signup.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("b_register_success.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	

	@FXML
	 public void C_Home() throws Exception 
		{
		
		
		Stage stage = (Stage) C_Home.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("Home.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	@FXML
	 public void O_Home() throws Exception 
		{
		
		
		Stage stage = (Stage) O_Home.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("Owner_Home.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	@FXML
	 public void View_Sales() throws Exception 
		{
		
		
		Stage stage = (Stage) View_Sales.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("B_Sales.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	
	
}
