package j9Building_Database_Applications_with_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ex12 {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3305/school2";
		String user="root";
		String password="1234";
		Connection con=null;
		try{
			//line n1
			Properties prop=new Properties();
			   prop.put("user",user);
			   prop.put("password",password);
			   con=DriverManager.getConnection(url,prop);
			if(con!=null){
				System.out.print("Connection Established.");
			}
		} catch(Exception e){
			System.out.print(e);
		}

	}

}
/*
Given the code fragment:

Connection con=null;
try{
	//line n1
	if(con!=null){
		System.out.print("Connection Established.");
	}
} catch(Exception e){
	System.out.print(e);
}


Assume that dbURL,userName, and password are valid.

Which code fragment can be inserted at line n1 to enable the code to print Connection
Established?


A) con=DriverManager.getConnection(userName,password,dbURL);

B) Properties prop=new Properties();
   prop.put("user",userName);
   prop.put("password",password);
   con=DriverManager.getConnection(dbURL,prop);
   
C) con=DriverManager.getConnection(dbURL);
   con.setClientInfo("user",userName);
   con.setClientInfo("password",password);

D) Properties prop=new Properties();
   prop.put("userId",userName);
   prop.put("password",password);
   prop.put("url",dbURL);
   con=DriverManager.getConnection(prop);
   
   
ans:B
     





*/