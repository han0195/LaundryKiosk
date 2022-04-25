package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class MachineManagement implements Initializable{
    @FXML
    private Label lablcname;

    @FXML
    private Label lablmnum;

    @FXML
    private Label lablprice;

    @FXML
    private Label lablmo;

    @FXML
    private Button btnaddmo;

    @FXML
    private Label lablmosen;

    @FXML
    private Button btnhome;

    @FXML
    void addmo(ActionEvent event) {

    }

    @FXML
    void home(ActionEvent event) {

    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	lablcname.setText(CleanserDetail.table.getCname());
    	lablmnum.setText(Integer.toString(CleanserDetail.table.getMnum()));
    	lablprice.setText(Integer.toString(CleanserDetail.table.getWholeprice()));
    	lablmo.setText(Integer.toString(CleanserDetail.table.getMamount()));
    	lablmosen.setText(Integer.toString(CleanserDetail.table.getMamount()) + "%");
    }

}
