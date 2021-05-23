package exam.e5;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    public static void main(String[] args) {

        //實作1.加入二台Notebook("Asus",30000),Notebook("Acer",20000),Food("Cookie",200)到shoppingList中
    	
    	Product Asus=new Notebook("Asus", 30000);
    	Product Acer=new Notebook("Acer", 20000);
    	Product cookie = new Food("Cookie", 200);
    	List<Product> shoppingList = new ArrayList<>();
        shoppingList.add(Asus);
        shoppingList.add(Acer);
        shoppingList.add(cookie);
        
        //實作2.利用for迴圈，計算shoppingList中的總金額,並印在Console中
        int sum = 0;
        int sumOfNetbook = 0;
    	int Calculation = 0;
    	
        for (Product product : shoppingList) {
        	if(product instanceof Notebook) {
        		sumOfNetbook = sumOfNetbook + product.getPrice(); 
        		Calculation++;
        	}
        	sum = sum + product.getPrice(); 
        	}
        	System.out.println("你好! 今天一共消費:" + sum+ "元");
        	
        	System.out.println("===================================");
        	

        //實作3.利用for迴圈，計算shoppingList中是Notebook型態的總金額,並印在Console中
        
        	System.out.printf("筆電這邊一共%s台是:%s元",Calculation, sumOfNetbook );

    }
}
