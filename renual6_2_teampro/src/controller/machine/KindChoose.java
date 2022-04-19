package controller.machine;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
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
    	String rtemp = Main.main.temptable.get.cname;
    	if(rtemp.equals(세탁기)) {
    		Main.main.temptable.set(0,"대형세탁기",0,null,null,null,0,0);
    	}
    	if(rtemp.equals(건조기)) {
    		   Main.main.temptable.set(0,"대형건조기",0,null,null,null,0,0);
    	}
	 
    }

    @FXML
    void acchome(ActionEvent event) {
    	//loadpage 홈
    }

    @FXML
    void accmedium(ActionEvent event) {
    	String rtemp = Main.main.temptable.get.cname;
    	if(rtemp.equals(세탁기)) {
    		Main.main.temptable.set(0,"중형세탁기",0,null,null,null,0,0);
    	}
    	if(rtemp.equals(건조기)) {
    		   Main.main.temptable.set(0,"중형건조기",0,null,null,null,0,0);
    	}
    }

}
