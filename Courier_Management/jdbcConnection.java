package Courier_Management;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;

public class jdbcConnection {
	
	public static Connection getCon() throws SQLException {
	String url = "jdbc:mysql://localhost:3306/CourierManagement";
    String username = "root";
    String pwd = "root";
    try
    {
    Connection con = DriverManager.getConnection(url, username, pwd);
    return con;
    }
    catch(Exception e)
    {
        System.out.println(e);
        return null;
    }
	}
}
