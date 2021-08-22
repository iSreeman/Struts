package com.struts.Practice;

import java.sql.Connection;
import java.sql.DriverManager;

	@SuppressWarnings("deprecation")
	public class DBConnection 
	{
		private static Connection con = null;
		static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servlets", "root", "root");
			} 
			catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		public static Connection getConnection(){
			return con;
		}
		
	}