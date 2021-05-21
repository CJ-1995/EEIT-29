package exam.e5;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {

        //實作1.加入二台Notebook("Asus",30000),Notebook("Acer",20000),Food("Cookie",200)到shoppingList中
    	Product notebook1=new Notebook("Asus", 30000);
    	Product notebook2=new Notebook("Acer", 20000);
    	Product cookie = new Food("Cookie", 200);
    	List<Product> shoppingList = new ArrayList<Product>();
        shoppingList.add(notebook1);
        shoppingList.add(notebook2);
        shoppingList.add(cookie);
        
        //實作2.利用for迴圈，計算shoppingList中的總金額,並印在Console中
        int Console = 0;
        for (Product product : shoppingList) {
        Console = Console + product.getPrice(); 
        	System.out.println("產品名稱:"+product.getName()+"金額:"+product.getPrice());
        }
        	System.out.println("你好! 今天一共消費:" + Console+ "元");
        	
        	System.out.println("===================================");
        //實作3.利用for迴圈，計算shoppingList中是Notebook型態的總金額,並印在Console中
        int sum = 0;
        for (Product product : shoppingList) {
        	if(product.getClass() == Notebook.class) {
        sum = sum + product.getPrice(); 
        System.out.println("產品名稱:"+product.getName()+"金額:"+product.getPrice());
        	}
        }
        System.out.println("你好! 今天一共消費:" + sum + "元");


    }
}
