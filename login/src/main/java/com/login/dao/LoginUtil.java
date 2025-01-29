package com.login.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginUtil {
	
	private static String dburl = "jdbc:derby://localhost:1527/user;create=true";
	
	public static Connection getConnection() throws SQLException {
		Connection con = null;
		try {
			//Class.forName("org.apache.derby.jdbc.ClientDriver");
			Class.forName("org.apache.derby.jdbc.ClientDriver");
			con = DriverManager.getConnection(dburl);
			System.out.println(con);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public void close(Connection con) {
		if(con != null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) throws SQLException {
		Connection con = LoginUtil.getConnection();
		System.out.println("connection sucess"+con);
		Statement s = con.createStatement();
		//String query = "create table users(id int(11) NOT NULL AUTO_INCREMENT,username varchar(87),password varchar(45),email varchar(89),phonenum varchar(90))";
		/*
		 * String query = "CREATE TABLE users(" +
		 * "ID INTEGER NOT NULL PRIMARY KEY GENERATED ALWAYS AS IDENTITY"
		 * +"(START WITH 1,INCREMENT BY 1)," + "uname varchar(200)," +
		 * "password varchar(200)," + "email varchar(200)," + "phonenum varchar(200))";
		 * s.executeUpdate(query);
		 */
		System.out.println("table or stmt created");
		con.close();
	}
}
