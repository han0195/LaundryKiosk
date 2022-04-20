package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Machine;
import dto.temptable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MachineDao {
	
	public Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	private PreparedStatement ps_;
	private ResultSet rs_;
	
	
	public static MachineDao machineDao = new MachineDao();
	
	public ObservableList<temptable> list(String a) {
		
		ObservableList<temptable> tempList = FXCollections.observableArrayList();
		try {
		
			String sql = "select * from machine order by mnum";
		
			ps = conn.prepareStatement(sql);
		
			rs = ps.executeQuery();

			String sql_ = "select * from category where cname="+a+" order by cnum";
			
			ps_ = conn.prepareStatement(sql_);
		
			rs_ = ps_.executeQuery();
		
			
			while(rs_.next()) {
				temptable temp = new temptable(rs.getInt(1),
						rs_.getString(4),rs.getInt(2));
				
				tempList.add(temp);
			
			}
		
			return tempList;
		}catch (Exception e) {

		}
		
		
		return null;
	}
}
