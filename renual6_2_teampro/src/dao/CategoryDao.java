package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;

import controller.Main;
import dto.Category;
import dto.Machine;

public class CategoryDao {
	private Connection con; // DB연동시 사용되는 클래스 : DB연동클래스
	private PreparedStatement ps; // 연결된 DB내 SQL 조작 할때 사용되는 인터페이스 : DB조작인터페이스
	private ResultSet rs; // 결과물을 조작하는 인터페이스 
	
	public static CategoryDao categoryDao = new CategoryDao(); // DB 연동 객체;
	
	public CategoryDao() {
		try {
			// DB연동 
			Class.forName("com.mysql.cj.jdbc.Driver"); // 1. DB 드라이버 가져오기
			con = DriverManager.getConnection("jdbc:mysql://database-1.ctq8tels7lkd.us-east-1.rds.amazonaws.com:3306/javafx?serverTimezone=UTC",
					"focks","akfrdmsfocks0626!!$LLH"); // 2. DB 주소 연결 
		}
		catch(Exception e ) { System.out.println( "[DB 연동 오류]"+e  ); }
	}
	// Category불러오기
	public Category load(int mnum) {
		try {
			String sql = "select * from category where mnum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, mnum);
			rs = ps.executeQuery();
			Category category = null;
			if(rs.next()) {
				Category temp = new Category(	
						rs.getInt(1),
						rs.getInt(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getInt(5)	
						);
			category = temp;
			}
			return category;
		} catch (Exception e) {
			System.out.println("[sql 에러]" + e);
		}
		return null;
	}
	
	public void ch(int mnum) {
		
		
		try {
			String sql="update category set cname= ? where mnum=?";
			System.out.println(mnum);
			String ss=Main.main.temptable.getCname()+"이용중";
			System.out.println(ss);
			ps = con.prepareStatement(sql);
			ps.setString(1, ss);
			ps.setInt(2, mnum);
			ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public int load2(int mnum) {
		int qwer=0;
		try {
			String sql = "select * from category where mnum=?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, mnum);
			rs = ps.executeQuery();
			Category category = null;
			if(rs.next()) {
				Category temp = new Category(	
						rs.getInt(1),
						rs.getInt(2),
						rs.getInt(3),
						rs.getString(4),
						rs.getInt(5)	
						);
			category = temp;
			}
			qwer=category.getCprice();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return qwer;
		
	}
}