import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class JDBC_Method {
	private Connection conn;
	Scanner scan = new Scanner(System.in);
	//連線
	public void creatConnection() throws SQLException {
		conn = DriverManager.getConnection("jdbc:sqlserver://STUDENT-PC\\\\\\\\SQLEXPRESS:1433;databaseName=JDBC2;user=sa;password=123456");
		if( conn.isClosed())
			System.out.println("連線失敗");
		}
	//關連線
	public void closeConnection() throws SQLException {
		if(conn !=null)
			conn.close(); 
		System.out.println(" 感謝參觀 ");
	}
	//新增資料
	public void insertData(Java_Bean j) throws SQLException {
		String sqlStr = "Insert Into Death Values (?,?,?,?)";
		PreparedStatement preState = conn.prepareStatement(sqlStr);
		preState.setString(1, j.getGender());
		preState.setString(2, j.getDieOf());
		preState.setInt(3, j.getquantity());
		preState.setDouble(4, j.getMortality());

		int up = preState.executeUpdate();
		if(up>0) 
			System.out.println("新增資料成功");
		else
		System.out.println("新增失敗 請重新嘗試!");
		
		preState.close();
		
	}
	//修改資料    成功失敗 要輸出出來
	public void updateByIdAndGender(Java_Bean j) throws SQLException {
		String sql ="update Death set 死因= ?, 人數= ?,死亡率=? where id = ?";
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, j.getDieOf());
		pre.setInt(2, j.getquantity());
		pre.setDouble(3, j.getMortality());
		pre.setInt(4, j.getid());


		int executeUpdate = pre.executeUpdate();
		if(executeUpdate>0)
		System.out.println("修改資料成功");
		else
			System.out.println("修改失敗 請確認ID是否正確!");
		pre.close();

	}
	//刪除資料
	public void dleaetDataBtId(int ID) throws SQLException {
		String sql="delete from Death where id=?";
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setInt(1, ID);

		boolean ex = !pre.execute();
		if(ex==true)
			System.out.println("刪除成功");
		else 
			System.out.println("刪除失敗 請確認ID是否正確!");
		
		pre.close();

	}
	//年度十大死因
	public void seachTop() throws SQLException {
		String sql="select  * from Death  order by  id offset 1 rows fetch next 10 rows only";
		PreparedStatement pre = conn.prepareStatement(sql);
		ResultSet rs = pre.executeQuery();
		System.out.println("id	性別	 死因					死亡人數	死亡率");
		while (rs.next()) {
			System.out.printf("%d\t%s   %-30s\t\t%-10d\t%.2f\n",rs.getInt("id"),rs.getString("性別"),rs.getString("死因"),rs.getInt("人數"),rs.getFloat("死亡率"));
		
		}
		rs.close();
		pre.close();
	}	
	
	
	//查詢所有資料
	public void seachAll() throws SQLException {
		String sql="select * from Death  order by  id";
		PreparedStatement pre = conn.prepareStatement(sql);
		ResultSet rs = pre.executeQuery();
		System.out.println("id	性別	 死因						死亡人數	死亡率");
		while (rs.next()) {
			System.out.printf("%d\t%s   %-30s\t\t%-5d\t%.2f\n",rs.getInt("id"),rs.getString("性別"),rs.getString("死因"),rs.getInt("人數"),rs.getFloat("死亡率"));
		
		}
		rs.close();
		pre.close();
	}
	//查詢兩姓
	public void seachGender() throws SQLException {
		String sql="select * from Death where 性別 = '兩性'  order by  人數 DESC";
		PreparedStatement pre = conn.prepareStatement(sql);
		ResultSet rs = pre.executeQuery();
		System.out.println("id	性別	 死因						死亡人數		死亡率");
		while (rs.next()) {
			System.out.printf("%d\t%s   %-30s\t\t%-5d\t%.2f\n ",rs.getInt("id"),rs.getString("性別"),rs.getString("死因"),rs.getInt("人數"),rs.getFloat("死亡率"));
			
		}
		rs.close();
		pre.close();
	}
	//查詢男性
	public void seachMan() throws SQLException {
		String sql="select * from Death where 性別 = '男性' by  人數 DESC";
		PreparedStatement pre = conn.prepareStatement(sql);
		ResultSet rs = pre.executeQuery();
		System.out.println("id	性別	 死因						死亡人數		死亡率");
		while (rs.next()) {
			System.out.printf("%d\t%s   %-30s\t\t%-5d\t%.2f\n ",rs.getInt("id"),rs.getString("性別"),rs.getString("死因"),rs.getInt("人數"),rs.getFloat("死亡率"));
		}
		rs.close();
		pre.close();
	}
	//查詢女性
	public void seachWoman() throws SQLException {
		String sql="select * from Death where 性別 = '女性' order by  人數 DESC";
		PreparedStatement pre = conn.prepareStatement(sql);
		ResultSet rs = pre.executeQuery();
		System.out.println("id	性別	 死因						死亡人數		死亡率");
		while (rs.next()) {
			System.out.printf("%d\t%s   %-30s\t\t%-5d\t%.2f\n ",rs.getInt("id"),rs.getString("性別"),rs.getString("死因"),rs.getInt("人數"),rs.getFloat("死亡率"));
		}
		rs.close();
		pre.close();
	}
}
