package controller.phone;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class DialInput implements Initializable{
	@FXML
	private Button btn1;

	@FXML
	void a1(ActionEvent event) {
		Main.main.machine.setMphone(Main.main.machine.getMphone() + "1");
		System.out.println(Main.main.machine.getMphone());
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
}
