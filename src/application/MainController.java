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
	public Button customer_review;
	
	
	@FXML
	public Button feedback_submitted;
	
	
	@FXML
	public Button view_cust_profile;
	
	@FXML
	public Button update_cust_profile;
	
	@FXML
	public Button cust_update;
	
	
	@FXML
	public Button view_owner_profile;
	

	@FXML
	public Button update_owner_profile;
	

	@FXML
	public Button owner_update;
	
	
	@FXML
	public Button view_business_profile;
	

	@FXML
	public Button update_b_profile;
	

	@FXML
	public Button b_update;
	
	

	@FXML
	public Button b_open;
	

	@FXML
	public Button b_close;
	
	
	@FXML
	public Button aboutus;
	
	@FXML
	public Button contact;
	
	
	
	@FXML
	public TextField customer_signup_name;
	@FXML
	public TextField customer_signup_number;
	@FXML
	public TextField customer_signup_address;
	@FXML
	public TextField customer_signup_email;
	@FXML
	public TextField customer_signup_password;
	
	
	
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
	
	

	@FXML
	 public void customer_review() throws Exception 
		{
		
		
		Stage stage = (Stage) customer_review.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("Customer_Review.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	

	@FXML
	 public void Feedback_Submitted() throws Exception 
		{
		
		
		Stage stage = (Stage) feedback_submitted.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("Feedback_Submitted.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	@FXML
	 public void view_cust_profile() throws Exception 
		{
		
		
		Stage stage = (Stage) view_cust_profile.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("View_Cust_Profile.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	@FXML
	 public void update_cust_profile() throws Exception 
		{
		
		
		Stage stage = (Stage) update_cust_profile.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("Customer_update.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	@FXML
	 public void cust_update() throws Exception 
		{
		
		
		Stage stage = (Stage) cust_update.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("c_update_success.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	@FXML
	 public void view_owner_profile() throws Exception 
		{
		
		
		Stage stage = (Stage) view_owner_profile.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("View_Owner_Profile.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	@FXML
	 public void update_owner_profile() throws Exception 
		{
		
		
		Stage stage = (Stage) update_owner_profile.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("Owner_update.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	@FXML
	 public void owner_update() throws Exception 
		{
		
		
		Stage stage = (Stage) owner_update.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("o_update_success.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	@FXML
	 public void view_business_profile() throws Exception 
		{
		
		
		Stage stage = (Stage) view_business_profile.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("View_B_Profile.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	@FXML
	 public void update_b_profile() throws Exception 
		{
		
		
		Stage stage = (Stage) update_b_profile.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("B_update.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	
	@FXML
	 public void b_update() throws Exception 
		{
		
		
		Stage stage = (Stage) b_update.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("B_update_success.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
	

	@FXML
	 public void b_open() throws Exception 
		{
	
		
		Stage stage = (Stage) b_open.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("Store_open.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }

	@FXML
	 public void b_close() throws Exception 
		{
		
		
		Stage stage = (Stage) b_close.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("Store_Close.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	

	@FXML
	 public void aboutus() throws Exception 
		{
		
		
		Stage stage = (Stage) aboutus.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("AboutUs.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	

	@FXML
	 public void contact() throws Exception 
		{
		
		
		Stage stage = (Stage) contact.getScene().getWindow();
	     
	    stage.close();
	    
	     Scene quizScene = new Scene(FXMLLoader.load(getClass().
	     getResource("Contact.fxml")));
		 Stage primaryStage1 = new Stage();
		 primaryStage1.setScene(quizScene);
		 primaryStage1.show();
	
	    }
	
}
