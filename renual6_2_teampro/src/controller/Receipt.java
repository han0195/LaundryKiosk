package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Receipt implements Initializable{
	 	@FXML
	    private Button btnhome;

	    @FXML
	    private Button btnhome2;

	    @FXML
	    private Label phone;

	    @FXML
	    private Label category;

	    @FXML
	    private Label temperature;

	    @FXML
	    private Label drgree;

	    @FXML
	    private Label starttime;

	    @FXML
	    private Label endtime;

	    @FXML
	    private Label amoment;

	    @FXML
	    void home(ActionEvent event) {
	    	Main.main.loadpage2("/view/user/1번페이지(메인).fxml");
	    }
	    @FXML
	    void home2(ActionEvent event) {
	    	Main.main.loadpage2("/view/user/1번페이지(메인).fxml");
	    }
	    @Override
	    public void initialize(URL arg0, ResourceBundle arg1) {
	    	//db로 꺼내오기
	    	//머신
	    	//카테고리
//	    	amoment.setText(null);;
//	    	category.setText(null);
//	    	drgree.setText(null);
//	    	starttime.setText(null);
//	    	endtime.setText(null);
	    }
}
