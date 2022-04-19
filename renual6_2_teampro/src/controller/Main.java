package controller;

import java.net.URL;
import java.util.ResourceBundle;

import dto.Machine;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.BorderPane;

//���� ��Ʈ��
	//��� ���� ��������ȯ
public class Main {
	public static Main main;
	public Main() {
		main = this;
	}
	public static Machine machine;
	@FXML
	private BorderPane borderpane;
	public void initialize(URL arg0, ResourceBundle arg1) {
		machine = new Machine();
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
