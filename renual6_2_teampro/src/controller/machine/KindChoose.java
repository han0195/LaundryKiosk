package controller.machine;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
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
    private TableView<dto.Machine> machinetable;

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
    
    @Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		//1_1. 앞에서 세탁기 선택시
    	String rtemp = Main.main.temptable.get.cname;
    	if(rtemp.equals("세탁기")) {
    		Main.main.temptable.set(0,"중형세탁기",0,null,null,null,0,0);
    		
    		
    		ObservableList<dto.Machine> machinelist = MachineDao.machineDao.list();
        	
    		TableColumn tc = machinetable.getColumns().get(0);	
        	tc.setCellValueFactory( new PropertyValueFactory<>("mnum")); // 
        	
        	tc = boardtable.getColumns().get(1);	
        	tc.setCellValueFactory( new PropertyValueFactory<>("btitle"));
        	
        	tc = boardtable.getColumns().get(2);	
        	tc.setCellValueFactory( new PropertyValueFactory<>("bwrite"));
        	
        	tc = boardtable.getColumns().get(3);	
        	tc.setCellValueFactory( new PropertyValueFactory<>("bdate"));
        	
        	tc = boardtable.getColumns().get(4);	
        	tc.setCellValueFactory( new PropertyValueFactory<>("bview"));
        	
        	boardtable.setItems(boardlist);;
        	
        	boardtable.setOnMouseClicked( e -> { 
        	board = boardtable.getSelectionModel().getSelectedItem() ; 	
    		
    	}
    	//1_2. 앞에서 건조기 선택시
    	
    	
    	
    	
    	
  //////////////////////////
    	
    	//2_1.세탁기중형 선택시
    	
    	//2_2.세탁기대형 선택시
    	
    	//2_3.건조기중형 선택시
    	
    	//2_4.건조기대형 선택시
    	
    	
	}
	

}

	@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			//1_1. 앞에서 세탁기 선택시
	    	String rtemp = Main.main.temptable.get.cname;
	    	if(rtemp.equals("세탁기")) {
	    		Main.main.temptable.set(0,"중형세탁기",0,null,null,null,0,0);
	    		
	    		
	    		ObservableList<dto.Machine> machinelist = MachineDao.machineDao.list();
	        	
	    		TableColumn tc = boardtable.getColumns().get(0);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("mnum")); // 
	        	
	        	tc = boardtable.getColumns().get(1);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("btitle"));
	        	
	        	tc = boardtable.getColumns().get(2);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("bwrite"));
	        	
	        	tc = boardtable.getColumns().get(3);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("bdate"));
	        	
	        	tc = boardtable.getColumns().get(4);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("bview"));
	        	
	        	boardtable.setItems(boardlist);;
	        	
	        	boardtable.setOnMouseClicked( e -> { 
	        	board = boardtable.getSelectionModel().getSelectedItem() ; 	
	    		
	    	}
	    	//1_2. 앞에서 건조기 선택시
	    	
	    	
	    	
	    	
	    	
	  //////////////////////////
	    	
	    	//2_1.세탁기중형 선택시
	    	
	    	//2_2.세탁기대형 선택시
	    	
	    	//2_3.건조기중형 선택시
	    	
	    	//2_4.건조기대형 선택시
	    	
	    	
		}
		
	
	}
