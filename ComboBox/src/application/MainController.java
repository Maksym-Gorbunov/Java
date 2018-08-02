package application;

import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class MainController implements Initializable{
	@FXML
	public Label lblName;
	@FXML
	public ComboBox<String> combobox;
	@FXML
	public ComboBox<String> combobox1;
	@FXML
	public ListView<String> listview;
	
	
	
	ObservableList<String> list = FXCollections.observableArrayList("Max", "Daniel", "Tommy", "Tim");
		
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		combobox.setItems(list);
		listview.setItems(list);
	}
	
	@FXML
	public void comboboxChanged(ActionEvent event) {
		lblName.setText(combobox.getValue());
		listview.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
	
	@FXML
	public void comboboxMoreNames(ActionEvent event) {
		combobox.getItems().addAll("More1", "More2", "More3", "More..");
	}
	
	@FXML
	public void comboboxTocombobox1(ActionEvent event) {
		combobox1.getItems().add(combobox.getValue());
	}
	
	@FXML
	public void PrintSelected(ActionEvent event) {
		ObservableList<String> names;
		names = listview.getSelectionModel().getSelectedItems();
		for(String n: names) {
			System.out.println(n);
		}
	}
}
