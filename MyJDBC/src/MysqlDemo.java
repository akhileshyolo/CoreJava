import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;


public class MysqlDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int choices = 0;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Connection con = null;
		
		try {
			con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Statement stmt =null;
		try {
			stmt = (Statement) con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		try {
//			stmt.executeUpdate("CREATE TABLE demo(id INTEGER, name VARCHAR(20));");
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	
		String query="INSERT INTO demo(id,name) VALUES(?,?)";
		PreparedStatement ps = null;
		try {
			ps = (PreparedStatement) con.prepareStatement(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
		
		Scanner sc = new Scanner(System.in);
		
		int roll;
		String name;
		
//		while(true){
//			System.out.println("\n----Enter new Data------");
//			System.out.println("Enter Roll:");
//			roll = sc.nextInt();
//			
//			sc.nextLine();
//			
//			System.out.println("Enter Name");
//			name = sc.nextLine();
//
//
//			
//			try {
//				ps.setInt(1, roll);
//				ps.setString(2, name);
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			try {
//				ps.executeUpdate();
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//		}
		
	
	
		ResultSet rs = null;
		try {
			rs = stmt.executeQuery("Select * from demo");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			while(rs.next()){
				System.out.println("ID:"+rs.getInt(1)+"  Name:"+rs.getString(2));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
	}

}
