package com.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class  DBConnection {
 Connection con=null;
	public  Connection  GetConnection() {
		
	
	try {
		System.out.println("-------------IN DBCONNECTION------------");
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/school_db?useTimezone=true&serverTimezone=UTC","root","");
		
		System.out.println("-------------AFTER DBCONNECTION---------");
	} catch (Exception e) {
		
		e.printStackTrace();
	}
	
	return con;
	}
	
}
