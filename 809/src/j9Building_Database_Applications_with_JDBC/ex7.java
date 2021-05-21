package j9Building_Database_Applications_with_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex7 {

	public static void main(String[] args) {
		String dbURL="jdbc:mysql://localhost:3305/school";
		String userName="root";
		String passWord="1234";
		Connection conn;
		try {
			
			conn = DriverManager.getConnection(dbURL,userName,passWord);
			Statement st=conn.createStatement();
			String query="DELETE FROM Student WHERE id=103";
			System.out.println("Status: "+st.execute(query));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	

	}

}
/*
Given the structure of the Student table:

Student(id INTEGER,name VARCHAR)

Given the records from the STUDENT table:

ID  NAME
102 Edwin
103 Edward
103 Edwin

Given the code fragment:

Connection conn=DriverManager.getConnection(dbURL,userName,passWord);
Statement st=conn.createStatement();
String query="DELETE FROM Student WHERE id=103";
System.out.println("Status: "+st.execute(query));

Assume that:
	The required database driver is configured in the classpath.
	The appropriate database is accessible with the dbURL, userName, and passWord exists.

What is the result?

A) The program prints Status: false but the records from the Student table are not deleted.
B) The program prints Status: true and two records are deleted from the Student table.
C) A SQLException is thrown at runtime.
D) The program prints Status: false and two records are deleted from the Student table


ans:D

*/