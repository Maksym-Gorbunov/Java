package application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainController {
	@FXML
	private Label lblStatus;
	@FXML
	private Label lblWelcome;
	@FXML
	private TextField txtUserName;
	@FXML
	private TextField txtPassword;
	
	@FXML
	private void Login001(ActionEvent event) throws Exception{			//	throws Exception instead of try/catch blocks
		if(txtUserName.getText().equals("user") && txtPassword.getText().equals("pass")) {
			lblStatus.setText("Login Success");
			//open Main.fxml - 2nd window
			
			Stage primaryStage = new Stage();
			Parent root = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			Scene scene = new Scene(root,400,400);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setScene(scene);
			primaryStage.show();
		} else {
			lblStatus.setText("Login Failed");
		}
	}
}
