package controller.machine;

import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;

import controller.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;

public class OptionChoose implements Initializable{

	    
	    String mtemperature = "";
    	String mdegree = "";

	    @FXML
	    private RadioButton opt1_1;

	    @FXML
	    private ToggleGroup temperature;

	    @FXML
	    private RadioButton opt1_3;

	    @FXML
	    private RadioButton opt1_2;

	    @FXML
	    private RadioButton opt2_2;

	    @FXML
	    private ToggleGroup degree;

	    @FXML
	    private RadioButton opt2_1;

	    @FXML
	    private Label lblmkind;

	    @FXML
	    private Button btnhome;
	    
	    @FXML
	    private Button btncp;

	    @FXML
	    void acchome(ActionEvent event) {
	       	Main.main.loadpage2("/view/user/1번페이지(메인).fxml");
	    }
	    
	    @FXML
	    void clickevent1(MouseEvent event) {
	    	mtemperature="뜨거움";
			Alert alert = new Alert( AlertType.CONFIRMATION );
			alert.setHeaderText("온도-뜨거움선택완료");
			Optional<ButtonType> optional = alert.showAndWait();
	    }

	    @FXML
	    void clickevent2(MouseEvent event) {
	    	mtemperature="중간";
			Alert alert = new Alert( AlertType.CONFIRMATION );
			alert.setHeaderText("온도-중간선택완료");
			Optional<ButtonType> optional = alert.showAndWait();
	    }

	    @FXML
	    void clickevent3(MouseEvent event) {
	    	mtemperature="차가움";
			Alert alert = new Alert( AlertType.CONFIRMATION );
			alert.setHeaderText("온도-차가움선택완료");
			Optional<ButtonType> optional = alert.showAndWait();
	    }

	    @FXML
	    void clickevent4(MouseEvent event) {
	    	mdegree="강함";
			Alert alert = new Alert( AlertType.CONFIRMATION );
			alert.setHeaderText("세기-강함선택완료");
			Optional<ButtonType> optional = alert.showAndWait();
			
	    }

	    @FXML
	    void clickevent5(MouseEvent event) {
			mdegree="약함";
			Alert alert = new Alert( AlertType.CONFIRMATION );
			alert.setHeaderText("세기-약함선택완료");
			Optional<ButtonType> optional = alert.showAndWait();
	    }

    @FXML
    void cp(ActionEvent event) {
		Main.main.temptable.setMtemperature(mtemperature);
		Main.main.temptable.setMdegree(mdegree);
		
		Main.main.loadpage("/view/user/6번페이지(결제창)상단.fxml");
    	Main.main.loadpage2("/view/user/6번페이지(결제창)하단.fxml");
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		String rtemp = Main.main.temptable.getCname();
		lblmkind.setText(rtemp);
	}

}