package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Start extends Application{
	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = FXMLLoader.load(getClass().getResource("/view/main.fxml"));
		Scene scene = new Scene(parent);
		
		scene.getStylesheets().add( getClass().getResource("application.css").toExternalForm() );
		
		
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();	
	}
	public static void main(String[] args) {
		launch(args);
	}
}