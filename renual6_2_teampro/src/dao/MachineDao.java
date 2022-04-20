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
	
	
	public static MachineDao machineDao = new MachineDao();
	
	public ObservableList<temptable> list() {
		
		ObservableList<temptable> tempList = FXCollections.observableArrayList();
		try {
		
			String sql = "select * from Machine order by mnum";
		
			ps = conn.prepareStatement(sql);
		
			rs = ps.executeQuery();
		
			while(rs.next()) {
				Machine machine = new Machine(rs.getInt(1),
						rs.getInt(2));
				
				tempList.addAll(machine);
			
			}
		
			return tempList;
		}catch (Exception e) {

		}
		
		
		return null;
	}
}
