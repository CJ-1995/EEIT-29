package j9Building_Database_Applications_with_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ex10 {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3305/school2";
		String user="root";
		String password="1234";
		
		Connection con=DriverManager.getConnection(url,user,password);
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		st.execute("select * from student");
		ResultSet rs=st.getResultSet();
		rs.absolute(3);
		rs.moveToInsertRow();
		rs.updateInt(1,113);
		rs.updateString(2,"555");
		rs.updateRow();
		rs.refreshRow();
		System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
		

	}

}
/*
Given the records from the STUDENT table:

sid sname semail
111 James jame@uni.com
112 Jane  jane@uni.com
114 John  john@uni.com

Given the code fragment:

public static void main(String[] args) throws SQLException {
	//code to load and register valid jdbc driver go here
	String url="jdbc:mysql://localhost:3305/school2";
		String user="root";
		String password="1234";
		
		Connection con=DriverManager.getConnection(url,user,password);
		Statement st=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		st.execute("select * from student");
		ResultSet rs=st.getResultSet();
		rs.absolute(3);
		rs.moveToInsertRow();
		rs.updateInt(1,113);
		rs.updateString(2,"jane@uni.com");
		rs.updateRow();
		rs.refreshRow();
		System.out.println(rs.getInt(1)+" : "+rs.getString(2)+" : "+rs.getString(3));
	
	}
	
	Assume that the URL,username, and password are valid.
	
	What is the result?
	
	A) The STUDENT table is updateed with the record:
	   113:Jannet : jannet@uni.com
	   and the program prints:
	   114 : John : john@uni.com
	   
	B) The STUDENT table is not updated and the program prints:
	   114 : John : john@uni.com
	   
	C) A SQLException is thrown at run time.
	
    D) The STUDENT table is updated with the record:
       113 : Jannet : jannet@uni.com
       and the program prints:
       113 : Jannet : jannet@uni.com
       
       
    ans:C
	




*/