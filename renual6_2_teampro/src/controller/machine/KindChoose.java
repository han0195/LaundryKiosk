package controller.machine;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class KindChoose{
	
    @FXML
    private Button btnhome;

    @FXML
    private Button btnmedium;

    @FXML
    private Button btnbig;

    @FXML
    void accbig(ActionEvent event) {
    	//if
	    Main.main.temptable temp = new temptable(0,"중형",0,null,null,null,0,0);
	    temp.set
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
