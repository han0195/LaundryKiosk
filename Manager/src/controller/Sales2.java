package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.control.Button;

public class Sales2 implements Initializable{

    @FXML
    private Button btnsales1;

    @FXML
    private Button btnhome;

    @FXML
    private AreaChart chart;

    @FXML
    void home(ActionEvent event) {
    	Main.main.loadpage("/view/관리자1페이지.fxml");
    }

    @FXML
    void sales1(ActionEvent event) {
    	Main.main.loadpage("/view/관리자7페이지(이용빈도).fxml");
    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	// 차트기록
    	
    }
}
