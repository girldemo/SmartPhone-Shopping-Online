package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class CheckLoginDAO {
	private boolean check;
	public boolean isExistUser(String username,String password){
		DBConnect con = new DBConnect();
		PreparedStatement pst = null;
		ResultSet rs = null;
	try {
		String sql = "SELECT * FROM admin WHERE username =? and password  =? ";
		Connection conn = con.connect();
		pst = conn.prepareStatement(sql);  ;
		
		pst.setString(1,username);
		pst.setString(2,password);
		rs = pst.executeQuery();
		
		if(rs.next()) {
			check = true;
		}
		else check = false;
	} catch (Exception e) {
		e.printStackTrace();
	}
		
		return check;
	

}

}
