package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import java.util.Random;

public class MainController {
	@FXML	//connect Main.fxml with controller
	private Label my_message;
	
	public void generateRandom(ActionEvent event) {
		Random rand = new Random();
		int my_random = rand.nextInt(50)+1;
		
		my_message.setText(Integer.toString(my_random));	//text to label in app
		//System.out.println(Integer.toString(my_random));	//text to console
	}
}
 