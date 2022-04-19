package controller.machine;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
//선택한 중형인지 대형인지 dto로 전달
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class KindChoose implements Initializable{
	
	public 
    @FXML
    private Button btnhome;

    @FXML
    private Button btnmedium;

    @FXML
    private Button btnbig;

    @FXML
    int accbig(ActionEvent event) {
    	return 1;
    }

    @FXML
    void acchome(ActionEvent event) {
    	//loadpage 홈
    }

    @FXML
    int accmedium(ActionEvent event) {
    	return 0;
    }

}
