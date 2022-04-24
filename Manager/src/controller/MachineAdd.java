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
import javafx.scene.control.TextField;

public class MachineAdd implements Initializable{

    @FXML
    private Label money;

    @FXML
    private Button btnup;

    @FXML
    private Button btndown;

    @FXML
    private Button btncheck;

    @FXML
    private Button btnhome;

    @FXML
    private TextField nametext;

    @FXML
    void check(ActionEvent event) {
    	//db 추가
    	//관리자4페이지 로드
    	Main.main.loadpage("/view/관리자2페이지.fxml");
    }

    @FXML
    void down(ActionEvent event) {
    	int moneytemp = Integer.parseInt(money.getText());
    	if(moneytemp != 0) {
    		moneytemp -= 500;
    		money.setText(Integer.toString(moneytemp));
    	}else {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("0이하는 가격 내릴수없습니다.");
    		alert.show();
    	}
    	//Main.main.loadpage("/view/관리자3페이지추가.fxml");
    }

    @FXML
    void home(ActionEvent event) {
    	Main.main.loadpage("/view/관리자1페이지.fxml");
    }

    @FXML
    void up(ActionEvent event) {
    	int moneytemp = Integer.parseInt(money.getText());
    		moneytemp += 500;
    		money.setText(Integer.toString(moneytemp)); 	
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	// TODO Auto-generated method stub
    	
    }
}
