package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;

public class CleanserDetail implements Initializable{

    @FXML
    private TableView<?> mtableview;

    @FXML
    private Button btnmadd;

    @FXML
    private Button btnhome;

    @FXML
    void home(ActionEvent event) {
    	Main.main.loadpage("/view/관리자1페이지.fxml");
    }

    @FXML
    void madd(ActionEvent event) {
    	Main.main.loadpage("/view/관리자3페이지추가.fxml");
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
    	
    }
}
