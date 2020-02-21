package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Testsample3Controller implements Initializable {
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
	}
	@FXML
	public Button b = new Button();
	public Label l = new Label();
	@FXML 
	public void click(ActionEvent event ) {
		l.setText("clicked");
	}
}
