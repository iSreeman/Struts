package com.struts.Practice;

import java.sql.Connection;  
import java.sql.PreparedStatement;  
import java.sql.ResultSet;

import javax.servlet.annotation.WebServlet;  
  
@WebServlet("/LoginDao")
public class LoginDao {  
  
public static boolean validate(String username,String userpass){  
 boolean status=false;  
  try{  
   Connection con = DBConnection.getConnection();
     
   PreparedStatement ps=con.prepareStatement(  
     "select * from registeruser where name=? and password=?");  
   ps.setString(1,username);  
   ps.setString(2,userpass);  
   ResultSet rs=ps.executeQuery();  
   status=rs.next();  
  }
  catch(Exception e){
	  e.printStackTrace();
	  }  
 return status;  
}  
}  