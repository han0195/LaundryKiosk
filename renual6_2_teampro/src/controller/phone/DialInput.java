package controller.phone;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;

public class DialInput implements Initializable{
    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button btnback;

    @FXML
    private Button btn0;

    @FXML
    private Button btncheck;

    @FXML
    private Button btnhome;

    @FXML
    void a0(ActionEvent event) {
    	Main.main.temptable.setMphone(Main.main.temptable.getMphone() + "0");
    	Main.main.loadpage2("/view/user/2페이지하단(전화상단).fxml");
    }

    @FXML
    void a1(ActionEvent event) {
    	Main.main.temptable.setMphone(Main.main.temptable.getMphone() + "1");
    	Main.main.loadpage2("/view/user/2페이지하단(전화상단).fxml");
    }

    @FXML
    void a2(ActionEvent event) {
    	Main.main.temptable.setMphone(Main.main.temptable.getMphone() + "2");
    	Main.main.loadpage2("/view/user/2페이지하단(전화상단).fxml");
    }

    @FXML
    void a3(ActionEvent event) {
    	Main.main.temptable.setMphone(Main.main.temptable.getMphone() + "3");
    	Main.main.loadpage2("/view/user/2페이지하단(전화상단).fxml");
    }

    @FXML
    void a4(ActionEvent event) {
    	Main.main.temptable.setMphone(Main.main.temptable.getMphone() + "4");
    	Main.main.loadpage2("/view/user/2페이지하단(전화상단).fxml");
    }

    @FXML
    void a5(ActionEvent event) {
    	Main.main.temptable.setMphone(Main.main.temptable.getMphone() + "5");
    	Main.main.loadpage2("/view/user/2페이지하단(전화상단).fxml");
    }

    @FXML
    void a6(ActionEvent event) {
    	Main.main.temptable.setMphone(Main.main.temptable.getMphone() + "6");
    	Main.main.loadpage2("/view/user/2페이지하단(전화상단).fxml");
    }

    @FXML
    void a7(ActionEvent event) {
    	Main.main.temptable.setMphone(Main.main.temptable.getMphone() + "7");
    	Main.main.loadpage2("/view/user/2페이지하단(전화상단).fxml");
    }

    @FXML
    void a8(ActionEvent event) {
    	Main.main.temptable.setMphone(Main.main.temptable.getMphone() + "8");
    	Main.main.loadpage2("/view/user/2페이지하단(전화상단).fxml");
    }

    @FXML
    void a9(ActionEvent event) {
    	Main.main.temptable.setMphone(Main.main.temptable.getMphone() + "9");
    	Main.main.loadpage2("/view/user/2페이지하단(전화상단).fxml");
    }

    @FXML
    void back(ActionEvent event) { // 번호 1개 씩 지우기
    	Main.main.temptable.setMphone(Main.main.temptable.getMphone().substring(0,
    			Main.main.temptable.getMphone().length()-1));
    }

    @FXML
    void check(ActionEvent event) {
    	//예외처리
    	if(Main.main.temptable.getMphone().length() == 9) {
    		Main.main.loadpage2("/view/user/3번페이지(세탁건조선택).fxml");
    	}else {
    		Alert alert = new Alert(AlertType.INFORMATION);
    		alert.setHeaderText("올바른 번호가 아닙니다");
    		
    	}
    }

    @FXML
    void home(ActionEvent event) {
    	Main.main.loadpage2("/view/user/1번페이지(메인).fxml");  	
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	Main.main.temptable.setMphone("");
    	
    }
}
