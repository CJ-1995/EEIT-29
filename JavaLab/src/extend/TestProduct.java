package extend;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

public class TestProduct {

	public static void main(String[] args) {
		//Notbook具備兩種型態 一個是本身的Notbook 另一個是繼承Product來的
		Notebook nb = new Notebook("Asus", 30000, 365);
		//System.out.printf("%s,%d,%d,%n",nb.getName(),nb.getPrice(),nb.getWarranty());
	
		Product item = nb; //Notebook -->Product 子類別轉父類別
		System.out.println(item instanceof Notebook);
		if(item instanceof Notebook) {
			Notebook nb1 =(Notebook) item;//Product-->Notebook(?) 父類別轉子類別
			System.out.println("保固:"+nb1.getWarranty());
		}
			
		//Food f1 = (Food)item; //Product -->Food(?)  父類別轉子類別
		
		
		System.out.println(nb.desc());
		//要先取得日歷Calendar 在取得日期 Data ,月份是0起算
//		GregorianCalendar calendar = new GregorianCalendar(2021, 5, 13);
		GregorianCalendar calendar = new GregorianCalendar(2077,Calendar.MAY, 13);
		Date data = calendar.getTime();
		Food food = new Food("肉鬆",200,data);
				
//		Product[] items = new Product[] {nb, food};
		Product[] items = {nb, food};
		buy(items);  
	}
	
	public static void buy(Product[] ps) {
		int sum = 0;
		for (Product eachProduct : ps) {
			System.out.println("買入:"+eachProduct.desc());
			sum = sum + eachProduct.getPrice();
		}
		System.out.println("你好! 今天一共消費" + sum + "元");
	}

	
}
