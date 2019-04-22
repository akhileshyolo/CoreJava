package q3b;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class MainFlight {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/flight", "root", "");
		
		//Create Table
		//createDbSchema(con);
		
		//insert Data
		insertData(con,101,"Mumbai", "Delhi", 150, 15000);
		insertData(con,102,"Mumbai", "Delhi", 200, 16000);
		insertData(con,103,"Delhi", "Mumbai", 300, 19000);
		insertData(con,104,"Mumbai", "Delhi", 250, 12000);
		insertData(con,105,"Delhi", "Mumbai", 160, 13000);	
		
		

	}
	
	public static void createDbSchema(Connection con) throws SQLException{
		
		
		String schema = "Create table flight("
						+ "flightid int,"
						+ "from_location varchar(30),"
						+ "to_location varchar(30),"
						+ "flight_duration int,"
						+ "flight_cost int"
						+ ")";
		
		System.out.println(schema);
		//For normal static based Queries
		Statement stmt = con.createStatement();
		stmt.execute(schema);
		
	}
	
	public static void insertData(Connection con, int id, String from, String to, int duration, int cost) throws SQLException{
		Statement stmt = con.createStatement();
		
		//For dynamic fixed compiled queries
		String sql="INSERT INTO flight VALUES(?,?,?,?,?)";
		PreparedStatement pstmt = con.prepareStatement(sql);
		
		//Column index, col values
		pstmt.setInt(1,id);
		pstmt.setString(2,from);
		pstmt.setString(3,to);
		pstmt.setInt(4,duration);
		pstmt.setInt(5,cost);
		
		pstmt.executeUpdate();
		
		//For normal insert
		//use stmt.executeUpdate(query);
		
	}

}
