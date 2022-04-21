package controller.machine;

import java.net.URL;
import java.util.ResourceBundle;

import controller.Main;
import dao.MachineDao;
import dto.temptable;
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
    

    String b= Main.main.temptable.get.cname;
    String d= Main.main.temptable.get.mphone;
    
    
    @FXML
    void accbig(ActionEvent event) {
    	String rtemp = Main.main.temptable.get.cname;
    		if(rtemp.equals("세탁기")) {
    			Main.main.temptable.set(0,"대형세탁기",0,d,null,null,0,0);
    	
    	//세탁기 대형 출력
    		//테이블출력
    		Main.main.loadpage2("/view/user/4번페이지(세탁기선택)미완성.fxml");
    	}
    	if(rtemp.equals("건조기")) {
    		Main.main.temptable.set(0,"대형건조기",0,d,null,null,0,0);
    	
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
    		Main.main.temptable.set(0,"중형세탁기",0,d,null,null,0,0);
    	
    	//세탁기 중형 출력
    		//테이블출력
    		Main.main.loadpage2("/view/user/4번페이지(세탁기선택)미완성.fxml");
    	}
    	if(rtemp.equals("건조기")) {
    		Main.main.temptable.set(0,"중형건조기",0,d,null,null,0,0);
    	
    	//건조기 중형 출력
    		 //테이블출력
       		Main.main.loadpage2("/view/user/4번페이지(세탁기선택)미완성.fxml");
    	}
    }  
    	


	///이니셜라이즈시작///
	///////////////////////////////////////////
		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			
	    	String rtemp = Main.main.temptable.get.cname;
	    	
	    	//1. 앞에서 세탁기 선택시
	    	//1_1. 앞에서 중형세탁기 선택시
	    	if(rtemp.equals("세탁기")||rtemp.equals("중형세탁기")) {
	    		
	    		ObservableList<dto.temptable> templist = MachineDao.machineDao.list("중형세탁기");
	        	
	    		TableColumn tc = temptable.getColumns().get(0);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("mnum")); // 
	        	
	        	tc = temptable.getColumns().get(1);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("cname"));
	        	
	        	tc = temptable.getColumns().get(2);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("mamount"));
	        	
	        	temptable.setItems(templist);
	        	
	        	temptable.setOnMouseClicked(e->{
	        		//세탑옵션선택페이지로 선택한 중형 대형 넘겨주기
	        		int a= temptable.getSelectionModel().getSelectedItem().getMnum();
	        		String b= temptable.getSelectionModel().getSelectedItem().getCname();
	        		int c= temptable.getSelectionModel().getSelectedItem().getMamount();
	        		
	        		Main.main.temptable.set(a,b,c,d,"미설정","미설정",0,0);
	        		Main.main.loadpage("/view/user/5번페이지(세탁옵션 선택) 상단.fxml");
	        		Main.main.loadpage2("/view/user/5번페이지(세탁옵션선택)하단.fxml");
	        		
	        	});
	    	}
	    	//2. 앞에서 건조기 선택시
	    	//2_1. 앞에서 중형건조기 선택시
	    	else if(rtemp.equals("건조기")||rtemp.equals("중형건조기")) {
	    		
	    		ObservableList<dto.temptable> templist = MachineDao.machineDao.list("중형건조기");
	        	
	    		TableColumn tc = temptable.getColumns().get(0);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("mnum")); // 
	        	
	        	tc = temptable.getColumns().get(1);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("cname"));
	        	
	        	tc = temptable.getColumns().get(2);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("mamount"));
	        	
	        	temptable.setItems(templist);
	        	
	        	temptable.setOnMouseClicked(e->{
	        		//세탑옵션선택페이지로 선택한 중형 대형 넘겨주기
	        		int a= temptable.getSelectionModel().getSelectedItem().getMnum();
	        		String b= temptable.getSelectionModel().getSelectedItem().getCname();
	        		int c= temptable.getSelectionModel().getSelectedItem().getMamount();
	        		
	        		Main.main.temptable.set(a,b,c,d,"미설정","미설정",0,0);
	        		Main.main.loadpage("/view/user/5번페이지(세탁옵션 선택)상단.fxml");
	        		Main.main.loadpage2("/view/user/5번페이지(세탁옵션선택)하단.fxml");
	        	});
	    	}
	    	//1_2. 앞에서 대형세탁기 선택시
	    	else if(rtemp.equals("대형세탁기")) {
	    		
	    		ObservableList<dto.temptable> templist = MachineDao.machineDao.list("대형세탁기");
	        	
	    		TableColumn tc = temptable.getColumns().get(0);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("mnum")); // 
	        	
	        	tc = temptable.getColumns().get(1);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("cname"));
	        	
	        	tc = temptable.getColumns().get(2);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("mamount"));
	        	
	        	temptable.setItems(templist);
	        	
	        	temptable.setOnMouseClicked(e->{
	        		//세탑옵션선택페이지로 선택한 중형 대형 넘겨주기
	        		int a= temptable.getSelectionModel().getSelectedItem().getMnum();
	        		String b= temptable.getSelectionModel().getSelectedItem().getCname();
	        		int c= temptable.getSelectionModel().getSelectedItem().getMamount();
	        		
	        		Main.main.temptable.set(a,b,c,d,"미설정","미설정",0,0);
	        		Main.main.loadpage("/view/user/5번페이지(세탁옵션 선택) 상단.fxml");
	        		Main.main.loadpage2("/view/user/5번페이지(세탁옵션선택)하단.fxml");
	        	});
	    	}
	    	//2_2. 앞에서 대형건조기 선택시
	    	else if(rtemp.equals("대형건조기")) {
	    		
	    		ObservableList<dto.temptable> templist = MachineDao.machineDao.list("대형건조기");
	        	
	    		TableColumn tc = temptable.getColumns().get(0);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("mnum")); // 
	        	
	        	tc = temptable.getColumns().get(1);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("cname"));
	        	
	        	tc = temptable.getColumns().get(2);	
	        	tc.setCellValueFactory( new PropertyValueFactory<>("mamount"));
	        	
	        	temptable.setItems(templist);
	        	
	        	temptable.setOnMouseClicked(e->{
	        		//세탑옵션선택페이지로 선택한 중형 대형 넘겨주기
	        		int a= temptable.getSelectionModel().getSelectedItem().getMnum();
	        		String b= temptable.getSelectionModel().getSelectedItem().getCname();
	        		int c= temptable.getSelectionModel().getSelectedItem().getMamount();
	        		
	        		Main.main.temptable.set(a,b,c,d,"미설정","미설정",0,0);
	        		Main.main.loadpage("/view/user/5번페이지(세탁옵션 선택) 상단.fxml");
	        		Main.main.loadpage2("/view/user/5번페이지(세탁옵션선택)하단.fxml");
	        	});
	        	
	    	}
	    	
		}
		
		
		///이니셜라이즈마무리///
///////////////////////////////////////////
    	
    	
		
		
		
	
	}
