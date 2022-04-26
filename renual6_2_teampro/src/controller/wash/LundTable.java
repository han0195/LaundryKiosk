package controller.wash;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableView;

public class LundTable implements Initializable{

    @FXML
    private TableView<dto.temptable> temptable2;

    @FXML
    private Button btnhome;

    @FXML
    private Label phonelbl;

    @FXML
    void acchome(ActionEvent event) {
        Main.main.loadpage2("/view/user/1번페이지(메인).fxml");     
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		phonelbl.setText(Main.main.temptable.getMphone());
	}

}
