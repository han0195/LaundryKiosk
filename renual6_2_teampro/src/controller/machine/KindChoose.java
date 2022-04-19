package controller.machine;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
//선택한 중형인지 대형인지 dto로 전달
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class KindChoose implements Initializable{

    @FXML
    private Button btnhome;

    @FXML
    private Button btnmedium;

    @FXML
    private Button btnbig;

    @FXML
    void accbig(ActionEvent event) {
    	
    }

    @FXML
    void acchome(ActionEvent event) {
    	//loadpage 홈
    }

    @FXML
    void accmedium(ActionEvent event) {
    	
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
	}
    
   
}
