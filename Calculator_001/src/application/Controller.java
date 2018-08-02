package application;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {
	
	@FXML
	private Label result;
	private float number1 = 0;
	private String operator = "";
	private boolean start = true;
	private Model model = new Model();
	
	@FXML
	public void processNumbers(ActionEvent event) {
		if (start) {
			result.setText("");
			start = false;
		}
		String value = ((Button)event.getSource()).getText();
		result.setText(result.getText() + value);
	}
	
	@FXML
	public void processOperator(ActionEvent event) {
		//value is operator
		String value = ((Button)event.getSource()).getText();
		
		if (!value.equals("=")) {
			if (!operator.isEmpty()) 
				return;
			
			operator = value;
			number1 = Float.parseFloat(result.getText());
			result.setText("");
			
		} else {
			if (operator.isEmpty()) 
				return;
			
			float number2 = Float.parseFloat(result.getText());
			
			float output = model.calculate(number1, number2, operator);
			result.setText(String.valueOf(output));
			
			//cleaning
			operator = "";
			start = true;
		}
	}
}


// ORIGINAL	
/*

package application;

import javafx.scene.control.Label;
import javafx.scene.control.Button;
//import java.awt.Button;
import javax.xml.stream.events.StartDocument;
//import java.awt.Label;				// OBS! this doesn't work for me
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class Controller {
	
	@FXML
	private Label result;
	private long number1 = 0;
	//private long number2 = 0;
	private String operator = "";
	private boolean start = true;
	private Model model = new Model();
	
	@FXML
	public void processNumbers(ActionEvent event) {
		if (start) {
			result.setText("");
			start = false;
		}
		// take text from button ex button '7' -> value = "7"
		String value = ((Button)event.getSource()).getText();
		// show pressed value on display
		result.setText(result.getText() + value);
	}
	
	@FXML
	public void processOperator(ActionEvent event) {
		//value is operator
		String value = ((Button)event.getSource()).getText();
		
		if (!value.equals("=")) {
			if (!operator.isEmpty()) 
				return;
			
			operator = value;
			number1 = Long.parseLong(result.getText());
			result.setText("");
			
		} else {
			if (operator.isEmpty()) 
				return;
			
			long number2 = Long.parseLong(result.getText());
			
			float output = model.calculate(number1, number2, operator);
			result.setText(String.valueOf(output));
			
			//cleaning
			operator = "";
			start = true;
		}
	}
}
*/