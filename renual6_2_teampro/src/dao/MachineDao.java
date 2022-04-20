package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.Machine;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class MachineDao {
	
	public Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	
	
	public static MachineDao machineDao = new MachineDao();
	
	public ObservableList<Machine> list() {
		
		ObservableList<Machine> machineList = FXCollections.observableArrayList();
		try {
		
			String sql = "select * from Machine order by mnum";
		
			ps = conn.prepareStatement(sql);
		
			rs = ps.executeQuery();
		
			while(rs.next()) {
				Machine machine = new Machine(rs.getInt(1),
						rs.getInt(1));
				
				machineList.add(machine);
			
			}
		
			return machineList;
		}catch (Exception e) {

		}
		
		
		return null;
	}
}
