package controller.machine;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.fxml.Initializable;


public class OptionChooseDetail implements Initializable{
	
		
    	String e= Main.main.temptable.getMtemperature();
    	String f= Main.main.temptable.getMdegree();
    	
		@FXML
	    private Label lbltemperature;

	    @FXML
	    private Label lbldree;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		lbltemperature.setText(e);
		lbldree.setText(f);
	}
	
}