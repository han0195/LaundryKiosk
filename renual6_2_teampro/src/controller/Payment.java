package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class Payment implements Initializable{
	 @FXML
	 private Button btnhome;

	 @FXML
	 private Button btnaddmoney;

	 @FXML
	 private Button btnpaymentend;

	 @FXML
	 void addmoney(ActionEvent event) {
		 //예외처리 dto mamount 보다 amount 값이더 적으면
		 if(Main.machine.getMamount() > Main.machine.getinputamount()) {
			 Main.machine.setinputamount(Main.machine.getinputamount() + 500);
		 }
		 //dto amount 500원추가
		 	
	 }

	 @FXML
	 void home(ActionEvent event) {

	 }

	 @FXML
	 void paymentend(ActionEvent event) {

	 }
	 @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
}
