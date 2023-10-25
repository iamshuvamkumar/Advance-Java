package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.LoginBin;
 

public class EmpDao {
	public boolean logingVerify(LoginBin lb) {
		boolean flag = false;
		System.out.println("Verify.........");
		try {
			Connection conn = DbConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("select * from emp_login where name=? and password=?");
			ps.setString(1, lb.getUsername());
			ps.setString(2, lb.getPassword());
			ResultSet rs = ps.executeQuery();
			if(rs.next()) {
				flag =true;
				return flag;
						
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		return flag;
	}
}
