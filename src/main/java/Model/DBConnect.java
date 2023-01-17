package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnect {
	private String hostName = "localhost:3360";
    private String dbName = "qldt";
    private String us = "root"; 
    private String pw = "ichigo2002";
    private String url = "jdbc:mysql://"+hostName+"/"+dbName;
    private Connection conn = null; 
    public Connection connect(){

    	try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
			
		//String sql = "SELECT * FROM admin WHERE username =? and password  =? ";
		try {
			conn = DriverManager.getConnection(url,us,pw);
			System.out.println("sussese!");
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
				System.out.println("Kết nối thất bại");
			}
             
      

        return conn;
    }

}