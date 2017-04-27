package com.wipro.bus.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	public static Connection getDBConnection() throws ClassNotFoundException, SQLException
	{
		 Connection conn;
		 Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:ORCL";
			String username="B44641345051";
			String pwd="B44641345051 ";
			conn=DriverManager.getConnection(url,username,pwd);
			System.out.println("Connection:"+conn);
		return conn;
	}
}


