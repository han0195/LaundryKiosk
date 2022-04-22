package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import dto.Sales;
import dto.count;

public class SalesDao {
	private Connection con; // DB연동시 사용되는 클래스 : DB연동클래스
	private PreparedStatement ps; // 연결된 DB내 SQL 조작 할때 사용되는 인터페이스 : DB조작인터페이스
	private ResultSet rs; // 결과물을 조작하는 인터페이스 
	
	public static SalesDao salesDao = new SalesDao(); // DB 연동 객체;
	
	public SalesDao() {
		try {
			// DB연동 
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. DB 드라이버 가져오기
			con = DriverManager.getConnection("jdbc:mysql://database-1.ctq8tels7lkd.us-east-1.rds.amazonaws.com:3306/javafx?serverTimezone=UTC",
					"focks","akfrdmsfocks0626!!$LLH"); // 2. DB 주소 연결 
		}
		catch(Exception e ) { System.out.println( "[DB 연동 오류]"+e  ); }
	}
	
	public ArrayList<count> frequency() {
		try {
			String sql = "select cnum, count(cnum) as cnt from javafx.sales group by cnum";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			ArrayList<count> count = new ArrayList<>();
			while(rs.next()) {
				count.add(new count(rs.getInt(1), rs.getInt(2)));
			}
			return count;
		} catch (Exception e) {
			System.out.println("[sql에러]" + e);
		}
		return null;
	}
}
