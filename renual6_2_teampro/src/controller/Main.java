package controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import dto.temptable;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Main implements Initializable{
	public static Main main;
	public Main() {
		main = this;
	}
	public static temptable temptable;
	@FXML
	private BorderPane borderpane;
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		temptable = new temptable();
		loadpage("/view/user/1번페이지(메인).fxml");
	}
	public void loadpage(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page));
			borderpane.setCenter(parent);
		}catch (Exception e) {
			System.out.println("페이지 오류" + e);
		}
	}
	public void loadpage2(String page) {
		try {
			Parent parent = FXMLLoader.load(getClass().getResource(page));
			borderpane.setBottom(parent);
		}catch (Exception e) {
			System.out.println("페이지 오류" + e);
		}
	}
	 

}
