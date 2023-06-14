package Lab_05;

import java.sql.*;

public class SqlConnection {
	
	 static Connection cn;
		
	 public static Connection Connector() 
		
	 {
	 	try {
	 		Class.forName("com.mysql.jdbc.Driver");
	 		
	 		Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/rupak", "root", "");
	 		System.out.println("Database Connected!");
	 		
	 		Statement statement = cn.createStatement();
	 		
	 		ResultSet resultset = statement.executeQuery(" select * from signup");
	 		
	 		while(resultset.next())
	 		{
	 			System.out.println(resultset.getNString(1) +" " + resultset.getInt(2)+ " " + resultset.getInt(3) + " " + resultset.getInt(4));
	 		}
	 		cn.close();
	 		
	 	return cn;
	 }
	 	catch (Exception e) 
	 	{
	 		System.out.println(e);
	 		return null;
	 		
	 	 		
	 	
	 	}
	 }
	 }

