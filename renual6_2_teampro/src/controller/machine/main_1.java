package controller.machine;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

public class main_1 implements Initializable{
	 @FXML
	 private Button bunstart;
	 
	 @FXML
	 private MediaView mediaview;

	 @FXML
	 void start(ActionEvent event) {
		 Main.main.loadpage("/view/user/6번페이지(결제창)상단.fxml");
		 Main.main.loadpage2("/view/user/6번페이지(결제창)하단.fxml");
		 Main.main.loadpage("/view/user/2페이지상단(전화번호).fxml");
		 Main.main.loadpage2("/view/user/2페이지하단(전화상단).fxml");
		 mediaplayer.stop();
	 }
	
	 Media media = new Media(getClass().getResource("/img/광고1.mp4").toString());
		
	MediaPlayer mediaplayer = new MediaPlayer(media);
		
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
    	
		mediaview.setMediaPlayer(mediaplayer);
		
		mediaplayer.play();
		
		mediaplayer.setAutoPlay(true);
		mediaplayer.setCycleCount(MediaPlayer.INDEFINITE);
		mediaview = new MediaView(mediaplayer);
    }
 
   
}