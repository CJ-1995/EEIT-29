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
//		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		conn = DriverManager.getConnection("jdbc:sqlserver://STUDENT-PC\\\\\\\\SQLEXPRESS:1433;databaseName=JDBC2;user=sa;password=123456");
		if( conn.isClosed())
			System.out.println("連線失敗");
		}
	//關連線
	public void closeConnection() throws SQLException {
		if(conn !=null)
			conn.close(); 
		System.out.println(" 連線已關閉 ");
	}
	//新增資料
	public void insertData(Java_Bean j) throws SQLException {
		String sqlStr = "Insert Into Death Values (?,?,?,?)";
		PreparedStatement preState = conn.prepareStatement(sqlStr);
		preState.setString(1, j.getGender());
		preState.setString(2, j.getDieOf());
		preState.setInt(3, j.getquantity());
		preState.setDouble(4, j.getMortality());
		//如果是 Y 就更新 不是就?
		String next = scan.next();
		System.out.println("確定資料無誤 請輸入:Y ");
		if(next=="Y") {
		int up = preState.executeUpdate();
		System.out.println("更新"+up+"筆成功");
		preState.close();
		}else {
			preState.close();
			System.out.println("不確定歐  那就回去查清楚 重來吧");
		}
	}
	//修改資料    成功失敗 要輸出出來
	public void updateByIdAndGender(Java_Bean j) throws SQLException {
		String sql ="update Death set 死因= ?, 人數= ?,死亡率=? where id = ? and 性別 = ?";
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setString(1, j.getDieOf());
		pre.setInt(2, j.getquantity());
		pre.setDouble(3, j.getMortality());
		pre.setInt(4, j.getid());
		pre.setString(5, j.getGender());
		String next = scan.next();
		System.out.println("確定資料無誤 請輸入:Y ");
		if(next=="Y") {
		int executeUpdate = pre.executeUpdate();
		System.out.println("修改"+executeUpdate+"筆資料");
		pre.close();
		}else {
			pre.close();
			System.out.println("不確定歐  那就回去查清楚 重來吧");
		}
	}
	//刪除資料
	public void dleaetDataBtId(int ID) throws SQLException {
		String sql="delete from Death where id=?";
		PreparedStatement pre = conn.prepareStatement(sql);
		pre.setInt(1, ID);
		String next = scan.next();
		System.out.println("確定刪除 請輸入:Y ");
		if(next=="Y") {
		boolean ex = pre.execute();
		System.out.println("刪除:"+ID+" "+ex);
		pre.close();
		}else {
			pre.close();
			System.out.println("又不刪了歐 ~~");			
		}
	}
	//查詢所有資料
	public void seachAll() throws SQLException {
		String sql="select * from Death  order by  id";
		PreparedStatement pre = conn.prepareStatement(sql);
		ResultSet rs = pre.executeQuery();
		System.out.println("id	性別				死因		死亡人數	死亡率");
		while (rs.next()) {
			System.out.printf("%d\t%s%30s\t\t\t%-1d\t%.2f\n",rs.getInt("id"),rs.getString("性別"),rs.getString("死因"),rs.getInt("人數"),rs.getFloat("死亡率"));
		
		}
		rs.close();
		pre.close();
	}
	//查詢兩姓
	public void seachGender() throws SQLException {
		String sql="select * from Death where id between 1 and 42 order by  人數 DESC";
		PreparedStatement pre = conn.prepareStatement(sql);
		ResultSet rs = pre.executeQuery();
		System.out.println("id	性別				死因				死亡人數		死亡率");
		while (rs.next()) {
			System.out.printf("%d\t%s%30s\t\t%-5d\t%.2f\n ",rs.getInt("id"),rs.getString("性別"),rs.getString("死因"),rs.getInt("人數"),rs.getFloat("死亡率"));
			
		}
		rs.close();
		pre.close();
	}
	//查詢男性
	public void seachMan() throws SQLException {
		String sql="select * from Death where id between 43 and  84order by  人數 DESC";
		PreparedStatement pre = conn.prepareStatement(sql);
		ResultSet rs = pre.executeQuery();
		System.out.println("id	性別				死因				死亡人數		死亡率");
		while (rs.next()) {
			System.out.printf("%d\t%s%30s\t\t%-5d\t%.2f\n ",rs.getInt("id"),rs.getString("性別"),rs.getString("死因"),rs.getInt("人數"),rs.getFloat("死亡率"));
		}
		rs.close();
		pre.close();
	}
	//查詢女性
	public void seachWoman() throws SQLException {
		String sql="select * from Death where id between 85 and  126 order by  人數 DESC";
		PreparedStatement pre = conn.prepareStatement(sql);
		ResultSet rs = pre.executeQuery();
		System.out.println("id	性別				死因				死亡人數		死亡率");
		while (rs.next()) {
			System.out.printf("%d\t%s%30s\t\t%-5d\t%.2f\n ",rs.getInt("id"),rs.getString("性別"),rs.getString("死因"),rs.getInt("人數"),rs.getFloat("死亡率"));
		}
		rs.close();
		pre.close();
	}
}
