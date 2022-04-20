package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Machine;
import dto.temptable;

public class MachineDao {
	private Connection con; // DB연동시 사용되는 클래스 : DB연동클래스
	private PreparedStatement ps; // 연결된 DB내 SQL 조작 할때 사용되는 인터페이스 : DB조작인터페이스
	private ResultSet rs; // 결과물을 조작하는 인터페이스 
	
	public static MachineDao machinedao = new MachineDao(); // DB 연동 객체;
	
	public MachineDao() {
		try {
			// DB연동 
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. DB 드라이버 가져오기
			con = DriverManager.getConnection("jdbc:mysql://database-1.ctq8tels7lkd.us-east-1.rds.amazonaws.com:3306/javafx?serverTimezone=UTC",
					"focks","akfrdmsfocks0626!!$LLH"); // 2. DB 주소 연결 
		}
		catch(Exception e ) { System.out.println( "[DB 연동 오류]"+e  ); }
	}
	//머신 저장
	public boolean update(temptable tb) {
		try {
			java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime()); // db date 타임 맞게 시간뽑기
			String sql = "update machine set mamount=?,mphone=?,mtemperature=?,mdegree=?,mtime=? where mnum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, tb.getMamount());
			ps.setString(2, tb.getMphone());
			ps.setString(3, tb.getMtemperature());
			ps.setString(4, tb.getMdegree());
			ps.setTimestamp(5,date);
			ps.setInt(6, tb.getMnum());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("[sql 에러]" + e);
		}
		return false;
	}
	//머신 불러오기
//	public ArrayList<Machine> load(int mnum) {
//		try {
//			String sql;
//		} catch (Exception e) {
//			System.out.println("[sql 에러]" + e);
//		}
//	}
	
}
