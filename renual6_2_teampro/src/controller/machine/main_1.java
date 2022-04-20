package controller.machine;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class main_1 implements Initializable{
	
	@FXML
    private WebView webview;

	 @FXML
	 private Button bunstart;

	 @FXML
	 void start(ActionEvent event) {
		 Main.main.loadpage("/view/user/6번페이지(결제창)상단.fxml");
		 Main.main.loadpage2("/view/user/6번페이지(결제창)하단.fxml");
//		 Main.main.loadpage("/view/user/2페이지상단(전화번호).fxml");
//		 Main.main.loadpage2("/view/user/2페이지하단(전화상단).fxml");
	 }
	 
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        WebEngine webEngine = webview.getEngine();
        webEngine.load("https://www.naver.com");

    }
 
   
}
