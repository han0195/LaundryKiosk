package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Payment implements Initializable{
	 
	@FXML
	private Label temperature;

	@FXML
	private Label mdegree;
	
	@FXML
	private Label catagroy;
	 
	@FXML
	private Label mamount;

	@FXML
	private Button btnhome;

	@FXML
	private Button btnaddmoney;

	@FXML
	private Button btnpaymentend;
	
	boolean pass = false; // 금액 충족 판단
	@FXML
	void addmoney(ActionEvent event) {
	    if(Main.main.temptable.getWholeprice() >= Main.main.temptable.getInputprice()) {//투입금액 충족시
	    	Main.main.temptable.setInputprice(Main.temptable.getInputprice() + 500); //500원추가
	    	Main.main.loadpage2("/view/user/6번페이지(결제창)상단.fxml"); // 버튼눌르때마다 새로고침
	    }else { // 투입금액 충족시
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("투입금액 충족했음 돌리셈");
	    	pass = true;
	    }
	}

	@FXML
	void home(ActionEvent event) {
		Main.main.loadpage2("/view/user/1번페이지(메인).fxml");	
	}

	@FXML
	void paymentend(ActionEvent event) {
		if(pass) { // 투입금액 충족여부 가 true이면
			Main.main.loadpage("/view/user/7번페이지(영수증)");
			//db에 집어넣기
		}else {
			Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("돈 넣으셈 ㅡㅡ");
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		temperature.setText(Main.main.temptable.getMtemperature()); //온도설정
		mamount.setText(Integer.toString(Main.main.temptable.getWholeprice())); // 총합가격
		mdegree.setText(Main.main.temptable.getMdegree()); //세기설정
		catagroy.setText(Main.main.temptable.getCname()); // catagroy1 넣기
		
	}

}
