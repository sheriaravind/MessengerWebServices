package org.aravind.messanger.helper;

import java.sql.*;

public class COnnectionHelper {
	
	public Connection getConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con = DriverManager.getConnection("jdbc:mysql://192.168.209.1:3306/messanger?useSSL=false", "root", "root");
    	return con;
	}
	
//	public static void main(String args[]) throws Exception {
//    	String query = "select Author from Messages where Id='100'";
//    	Class.forName("com.mysql.cj.jdbc.Driver");
//    	Connection con = DriverManager.getConnection("jdbc:mysql://192.168.209.1:3306/messanger?useSSL=false", "root", "root");
//    	Statement st = con.createStatement();
//    	ResultSet rs = st.executeQuery(query);
//    	rs.next();
//    	String author = rs.getString("Author");
//    	System.out.println(author);
//    	st.close();
//    	con.close();
//    }
}
