package j9Building_Database_Applications_with_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			String url="jdbc:mysql://localhost:3305/school2";
			String user="root";
			String password="1234";
			
			Connection con=DriverManager.getConnection(url,user,password);
			Statement stmt=con.createStatement();
			      ResultSet rs=stmt.executeQuery("select * from student");
			      //rs.next();
			      System.out.println("Employee ID:"+rs.getInt("ID"));
			  } catch(Exception se) {
			      System.out.println("Error");
			}
	}

}
/*
Given the code fragment:

10. try{
11.      Connection conn=DriverManager.getConnection(dbURL,userName,passWord);
12.      String query="SELECT * FROM Employee WHERE ID=110";
13.      Statement stmt=conn.createStatement();
14.      ResultSet rs=stmt.executeQuery(query);
15.      System.out.println("Employee ID:"+rs.getInt("ID"));
16.  } catch(Exception se) {
17.      System.out.println("Error");
18.  }


Assume that:
 The required database driver is configured in the classpath.
 The appropriate database is accessible with the dbURL, userName , and passWord exists.
 The Employee table has a column ID of type integer and the SQL query matches one record.
 
What is the result?

A) The code prints Error.

B) Compilation fails at line 15.

C) Compilation fails at line 14.

D) The code prints the employee ID.


ans: A





*/