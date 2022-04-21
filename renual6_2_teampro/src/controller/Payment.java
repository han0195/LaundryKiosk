package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dao.MachineDao;
import dto.Category;
import dto.Machine;
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
		
	    if(Main.main.temptable.getWholeprice() > Main.main.temptable.getInputprice()) {//투입금액 충족시
	    	Main.main.temptable.setInputprice(Main.main.temptable.getInputprice() + 500); //500원추가
	    	Main.main.loadpage2("/view/user/6번페이지(결제창)하단.fxml"); // 버튼눌르때마다 새로고침
	    	System.out.println(Main.main.temptable.getInputprice());
	    }else { // 투입금액 충족시
	    	pass = true;
	    	Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("투입금액 충족했음 돌리셈");
	    	alert.show();
	    }
	}

	@FXML
	void home(ActionEvent event) {
		Main.main.loadpage2("/view/user/1번페이지(메인).fxml");	// 잘려서 아래 추가 load 사용
		Main.main.temptable.setInputprice(0); // 금액초기화
	}

	@FXML
	void paymentend(ActionEvent event) {
		if(pass) { // 투입금액 충족여부 가 true이면
			//db에 집어넣기
			MachineDao.machinedao.update(Main.main.temptable);
			Main.main.loadpage2("/view/user/7페이지(영수증).fxml");
		}else {
			Alert alert = new Alert(AlertType.INFORMATION);
	    	alert.setHeaderText("마 ㄱㅅㄲ야 돈 넣으셈! ㅡㅡ");
	    	alert.show();
		}
	}
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//테스트 s
		Main.main.temptable.setWholeprice(5000); //테스트
		Main.main.temptable.setCname("중형세탁기");
		Main.main.temptable.setMnum(1);
		Main.main.temptable.setMamount(100);
		Main.main.temptable.setMphone("010-5694-0195");
		Main.main.temptable.setMtemperature("강함");
		Main.main.temptable.setMdegree("약함");
		// 테스트 e
		temperature.setText(Main.main.temptable.getMtemperature()); //온도설정
		mamount.setText(Integer.toString(Main.main.temptable.getWholeprice())); // 총합가격
		mdegree.setText(Main.main.temptable.getMdegree()); //세기설정
		catagroy.setText(Main.main.temptable.getCname()); // catagroy1 넣기	
	}
}