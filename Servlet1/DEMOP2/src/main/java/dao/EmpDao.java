package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.LoginBin;
import bean.RegisterBin;
 

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
	
	public boolean registerSt(RegisterBin  rb) {
		boolean flag = false;
		System.out.println("Register St.........");
		try {
			Connection conn = DbConnection.getConnection();
			PreparedStatement ps = conn.prepareStatement("insert into Student_Registration values(? ,?, ?, ?, ?)");
			System.out.println("insert ");
			ps.setInt(1, rb.getId());
			ps.setString(2, rb.getName());
			ps.setString(3, rb.getPassword());
			ps.setInt(4, rb.getMob());
			ps.setString(5, rb.getEmail());
			
			
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
