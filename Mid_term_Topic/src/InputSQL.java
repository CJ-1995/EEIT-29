
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;



//加分項目 使用java來讀取原檔案
public class InputSQL {
	 public static void main(String[] args) {
		 //IO讀取CSV 
		 try {
			Reader fileReader = new FileReader("C:\\TW.Death\\Death-9.csv");
			Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(fileReader);
			
			Connection conn = DriverManager.getConnection("jdbc:sqlserver://STUDENT-PC\\\\\\\\SQLEXPRESS:1433;databaseName=JDBC2;user=sa;password=123456");
			
			int i=0;
			for (CSVRecord record : records) {
				i++; if(i==1) continue;  //第一圈是抓 欄位名 所以挑過
				String z = record.get(0);
				String a = record.get(1);
				String c = record.get(3);
				String d = record.get(4);

				String sqlStr = "Insert Into Death Values (?,?,?,?)";
				PreparedStatement preState = conn.prepareStatement(sqlStr);
				preState.setString(1,z);
				preState.setString(2, a);
				preState.setInt(3, Integer.parseInt(c));
				preState.setDouble(4, Double.parseDouble(d));
				preState.executeUpdate();
			}
			System.out.println("更新成功");
		} catch (Exception e) {
				e.printStackTrace();
		}
	 }
}