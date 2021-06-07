import java.sql.SQLException;
import java.util.Scanner;

import javax.tools.ForwardingJavaFileManager;
import javax.xml.crypto.Data;
public class Man {
	public static void main(String[] args) throws SQLException  {
	
		//實體化
		JDBC_Method bean=Factory.Factory();
		Scanner scan = new Scanner(System.in);
		 try {
			 //開連線
			bean.creatConnection();
			while(true){
			System.out.println("****************************************");
			System.out.println("* 歡迎來到108年死亡紀錄資料庫 請選擇你需要的需求 *");
			System.out.println("*   1.查詢 2.修改 3.刪除 4.新增 5.關閉      *");
			System.out.println("****************************************");
			//輸入
				int sc = scan.nextInt();
				if(sc == 1) {
					System.out.println("     歡迎查詢");
					System.out.println("輸入 0 搜尋全部資料");
					System.out.println("輸入 1 搜尋兩性資料");
					System.out.println("輸入 2 搜尋男性資料");
					System.out.println("輸入 3 搜尋女性資料");
					int nextInt = scan.nextInt();
						if(nextInt==0)
							bean.seachAll();
						else if(nextInt==1)
							bean.seachGender();
						else if(nextInt==2)
							bean.seachMan();
						else if(nextInt==3)
							bean.seachWoman();
						else 
							System.out.println(" 重來吧 哈哈");
				}else if(sc == 2){
				//修改資料
				Java_Bean bean2=new Java_Bean();
				System.out.println("請務必注意!! 是根據 ID 與 性別 更新資料");
					System.out.print("請輸入ID:");
				bean2.setid(scan.nextInt());
					System.out.print("請輸入性別:");
				bean2.setGender(scan.next());
					System.out.print("請輸入死因:");
				bean2.setDieOf(scan.next());
					System.out.print("請輸入死亡人數:");
				bean2.setquantity(scan.nextInt());
					System.out.print("請輸入死亡率(死亡率=18024/死亡人數):");
				bean2.setMortality(scan.nextDouble());

				bean.updateByIdAndGender(bean2);
					
				}else if(sc==3){
					System.out.println("請輸入要刪除的ID");				
					int	id=scan.nextInt();
					bean.dleaetDataBtId(id);
				
				}else if(sc==4) {
					System.out.println("你確定? 這是108年的資料耶 在冰箱發現一局屍體嗎?");
					Java_Bean bean2=new Java_Bean();
						System.out.print("請輸入性別: ");
					bean2.setGender(scan.next());
						System.out.print("請輸入死因: ");
					bean2.setDieOf(scan.next());
						System.out.print("請輸入死亡人數: ");
					bean2.setquantity(scan.nextInt());
						System.out.print("請輸入死亡率(死亡率=18024/死亡人數): ");
					bean2.setMortality(scan.nextDouble());

					bean.insertData(bean2);
					
				}else if(sc==5) {
					break;
				}else {
					System.out.println("重來吧 哈哈");
					System.out.println("只能輸入 1 2 3 4 5");
				}
			 }
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				//關連線
				bean.closeConnection();
				scan.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		}
	}


	



