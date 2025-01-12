package projects.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import projects.exception.DbExeption;

public class DBConnection {
	private static String HOST = "localhost";
	private static String PASSWORD = "projects";
	private static int PORT = 3306;
	private static String SCHEMA = "projects";
	private static String USER = "projects";
	
	public static Connection getConnection() {
		String url = String.format("jdbc:mysql://%s:%d/%s?user=%s&password=%s&useSSL=false",
		HOST,PORT,SCHEMA,USER,PASSWORD);
				
		try {
			Connection conn = DriverManager.getConnection(url);
			System.out.println("Connection is successful");
			return conn;
		} catch (SQLException e) {
				throw new DbExeption(e);
		}
	}
	

}
