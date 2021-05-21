package j9Building_Database_Applications_with_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException  {
		//java.lang.Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "1234");
		String query = "SELECT id FROM student";
		try (Statement stmt = conn.createStatement()) {
		    ResultSet rs = stmt.executeQuery(query);
		   stmt.executeQuery("SELECT id FROM student");
		    while (rs.next()) {
		        //process the results
		        System.out.println("Employee ID: " + rs.getInt("id"));
		    }
		} catch (Exception e) {
		    System.out.println("Error");
		}
		
		
	}
}
	
/*
Given the code fragment:
Connection conn = DriverManager.getConnection(dbURL, userName, passWord);
String query = "SELECT id FROM Employee";
try (Statement stmt = conn.createStatement()) {
    ResultSet rs = stmt.executeQuery(query);
    stmt.executeQuery("SELECT id FROM Customer");
    while (rs.next()) {
        //process the results
        System.out.println("Employee ID: " + rs.getInt("id"));
    }
} catch (Exception e) {
    System.out.println("Error");
}
Assume that:

The required database driver is configured in the classpath.
The appropriate database is accessible with the dbURL, userName, and passWord exists.
The Employee and Customer tables are available and each table has id column with a few records and the SQL queries are valid.

What is the result of compiling and executing this code fragment?

A. The program prints employee IDs.
B. The program prints customer IDs.
C. The program prints Error.
D. compilation fails on line 13.




*/