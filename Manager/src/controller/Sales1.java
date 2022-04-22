package controller;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import dao.SalesDao;
import dto.count;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;

public class Sales1 implements Initializable{
    @FXML
    private Button btnch2;

    @FXML
    private Button btn;

    @FXML
    private AreaChart chart;

    @FXML
    void ch2(ActionEvent event) {
    	Main.main.loadpage("/view/관리자(이용빈도).fxml");
    }

    @FXML
    void home(ActionEvent event) {
    	Main.main.loadpage("/view/관리자1페이지.fxml");
    }
    @SuppressWarnings("unchecked")
	@Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	ArrayList<count> count2 = SalesDao.salesDao.frequency();
    	for(count temp : count2) {
    		System.out.println(temp.getCnum());
    	}
    	XYChart.Series case1 = new XYChart.Series();
		case1.setName("세탁/건조이용빈도");
		int p1 = 0;
		int p2 = 0;
		int p3 = 0;
		int p4 = 0;
		for(count temp : count2) {
			if(temp.getCnum() == 1) {
				p1 = temp.getCnt();
			}else if(temp.getCnum() == 2) {
				p2 = temp.getCnt();
			}else if(temp.getCnum() == 3) {
				p3 = temp.getCnt();
			}else if(temp.getCnum() == 4) {
				p4 = temp.getCnt();
			}
		}
		case1.setData(FXCollections.observableArrayList(
				new XYChart.Data("중형세탁기", p1),
				new XYChart.Data("대형세탁기", p2),
				new XYChart.Data("중형건조기", p3),
				new XYChart.Data("대형건조기", p4)
				));
		chart.getData().add(case1);
    }
}
