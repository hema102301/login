package com.login.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.login.dao.LoginUtil;
import com.login.model.Login;

public class LoginService {
	
	//insert user data to database
	public void registerUser(Login user) {
		//create connection
		//add user data to database
		try {
			Connection con = LoginUtil.getConnection();
			String sql = 
			"INSERT INTO users (uname, password, email, phonenum) VALUES (?, ?, ?, ?)";

			PreparedStatement pst = con.prepareStatement(sql);
		//	pst.setInt(1, user.getId());
			pst.setString(1, user.getUname());
			pst.setString(2, user.getPassword());
			pst.setString(3, user.getEmail());
			pst.setString(4, user.getPhoneNum());
			pst.executeUpdate();
			pst.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
   
	public boolean validateUser(Login user) {
		boolean status = false;
		try {
			Connection con = LoginUtil.getConnection();
			String sql = "select * from users where uname=? and password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, user.getUname());
			pst.setString(2, user.getPassword());
			
			ResultSet rs = pst.executeQuery();
			status = rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return status;
		
	}
}
