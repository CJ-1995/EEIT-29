import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.lang.model.element.NestingKind;

public class OuptCSV {

	public static void main(String[] args) {
		 try(//由檔案輸入
			FileInputStream file = new FileInputStream("C:\\TW.Death\\Death.csv");
			InputStreamReader reader = new InputStreamReader(file,"UTF8");
			BufferedReader bfReader = new BufferedReader(reader);
				 
			//連線
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://STUDENT-PC\\\\\\\\SQLEXPRESS:1433;databaseName=JDBC2;user=sa;password=123456");
		
			//輸出
			FileOutputStream fis= new FileOutputStream("C:\\TW.Death\\Death-1.csv");
			OutputStreamWriter osw= new OutputStreamWriter(fis,"MS950");
			BufferedWriter bw= new BufferedWriter(osw);
				 ) 
		 //SQL 輸出版
		 /*
		 {
			 String sql="select * from Death  order by  id";
			PreparedStatement pre = conn.prepareStatement(sql);
			ResultSet rs = pre.executeQuery();
			while (rs.next()) {
				 bw.newLine();

				 bw.write(rs.getString("性別"));
				 bw.write(",");
				 bw.write(rs.getString("死因"));
				 bw.write(",");
				 bw.write(Integer.toString( rs.getInt("人數")));
				 bw.write(",");
				 bw.write(Double.toString(rs.getFloat("死亡率")));
			}

			rs.close();
			pre.close();
			
			 System.out.println("輸出結束");
		 } */
			//檔案版輸入
		 {
		 String line;
		 while((line=bfReader.readLine())!=null) {  
			 String[] column=line.split(",");
				 //寫出
			 bw.newLine();
			 bw.write(column[0]);
			 bw.write(",");
			 bw.write(column[1]);
			 bw.write(",");
			 bw.write(column[2]);
			 bw.write(",");
			 bw.write(column[3]);
			 bw.write(",");
			 bw.write(column[4]);
			 System.out.println(column[0]+column[1]+column[2]+column[3]+column[4]);
			 }
			 	 System.out.println("輸出結束");
			}
			
		 catch (Exception e) {
			e.printStackTrace();
		}
	}



}
