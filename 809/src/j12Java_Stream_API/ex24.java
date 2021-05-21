package j12Java_Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ProductA> li=Arrays.asList(new ProductA("TV",1000), new ProductA("Refrigerator",
				2000));
				Consumer<ProductA> raise=e->e.setPrice(e.getPrice()+100);
				li.forEach(raise);
				li.stream().forEach(ProductA::printVal);

	}

}
class ProductA{
	String name;
	Integer price;
	ProductA(String name,Integer price)
	{
		this.name=name;
		this.price=price;	
	}
	
	public void printVal(){ System.out.print(name+" Price:"+price+" ");}
	public void setPrice(int price){this.price=price;}

	public Integer getPrice() {
		return price;
	}
	
}


/*
Given the code fragments:

public class Product{
	String name;
	Integer price;
	Product(String name,Integer price)
	{
		this.name=name;
		this.price=price;	
	}
	
	public void printVal(){ System.out.print(name+" Price:"+price+" ");}
	public void setPrice(int price){this.price=price;}

	public Integer getPrice() {
		return price;
	}
	
}

and

List<Product> li=Arrays.asList(new Product("TV",1000), new Product("Refrigerator",
2000));
Consumer<Product> raise=e->e.setPrice(e.getPrice()+100);
li.forEach(raise);
li.stream().forEach(Product::printVal);

What is the result?

A) A compilation error occurs.

B) TV Price :1000 Refrigerator price:2000

C) The program prints nothing.

D) TV Price:1000 Refrigerator Price:2100


ans:D





*/