package controller.machine;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import controller.home.Home;
import dao.MachineDao;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class KindChoose implements Initializable{
	
    @FXML
    private Button btnhome;

    @FXML
    private Button btnmedium;

    @FXML
    private Button btnbig;
    
    @FXML
    private TableView<dto.temptable> temptable;

    public static dto.Machine machine;
    
    @FXML
    void accbig(ActionEvent event) {
    	String rtemp = Main.main.temptable.get.cname;
    		if(rtemp.equals("세탁기")) {
    			Main.main.temptable.set(0,"대형세탁기",0,null,null,null,0,0);
    	
    	//세탁기 대형 출력
    		//테이블출력
    		Main.main.loadpage2("/view/user/4번페이지(세탁기선택)미완성.fxml");
    	}
    	if(rtemp.equals("건조기")) {
    		Main.main.temptable.set(0,"대형건조기",0,null,null,null,0,0);
    	
    	//건조기 대형 출력
    		//테이블출력
       		Main.main.loadpage2("/view/user/4번페이지(세탁기선택)미완성.fxml");
    	}
	 
    }

    @FXML		//홈가기
    void acchome(ActionEvent event) {
    	Main.main.loadpage2("/view/user/1번페이지(메인).fxml");
    }

    @FXML
    void accmedium(ActionEvent event) {
    	String rtemp = Main.main.temptable.get.cname;
    	if(rtemp.equals("세탁기")) {
    		Main.main.temptable.set(0,"중형세탁기",0,null,null,null,0,0);
    	
    	//세탁기 중형 출력
    		//테이블출력
    		Main.main.loadpage2("/view/user/4번페이지(세탁기선택)미완성.fxml");
    	}
    	if(rtemp.equals("건조기")) {
    		Main.main.temptable.set(0,"중형건조기",0,null,null,null,0,0);
    	
    	//건조기 중형 출력
    		 //테이블출력
       		Main.main.loadpage2("/view/user/4번페이지(세탁기선택)미완성.fxml");
    	}
    }  
    	//1_2. 앞에서 건조기 선택시
    	
    	
    	
    	
    	
  //////////////////////////
    	
    	//2_1.세탁기중형 선택시
    	
    	//2_2.세탁기대형 선택시
    	
    	//2_3.건조기중형 선택시
    	
    	//2_4.건조기대형 선택시
    	
    	
	
	


	@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			//1_1. 앞에서 세탁기 선택시
	    	String rtemp = Main.main.temptable.get.cname;
	    	if(rtemp.equals("세탁기")) {
	    		Main.main.temptable.set(0,"중형세탁기",0,null,null,null,0,0);
	    		
	    		
	    		ObservableList<dto.temptable> temptable = MachineDao.machineDao.list();
	        	
	    		TableColumn tc = machinetable.getColumns().get(0);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("mnum")); // 
	        	
	        	tc = machinetable.getColumns().get(1);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("mamount"));
	        	
	        	tc = machinetable.getColumns().get(2);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>(""));
	        	
	        	machinetable.setItems(machinelist);
	        	
	        	machinetable.setOnMouseClicked(e->{
	        		machine = machinetable.getSelectionModel().getSelectedItem();
	        		Main.main.loadpage2("/view/user/5번페이지(세탁옵션 선택)상단.fxml");
	        	});
	    	}
	    	//1_2. 앞에서 건조기 선택시
	    	
	    	
	    	
	    	
	    	
	  //////////////////////////
	    	
	    	//2_1.세탁기중형 선택시
	    	
	    	//2_2.세탁기대형 선택시
	    	
	    	//2_3.건조기중형 선택시
	    	
	    	//2_4.건조기대형 선택시
	    	
	    	
		}
		
	
	}
