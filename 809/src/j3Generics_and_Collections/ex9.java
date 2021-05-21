package j3Generics_and_Collections;

public class ex9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
Given:

class Product
{
	String name;
	int qty;
	public String toString()
	{
		return name;
	}
	public Product(String name,int qty)
	{
		this.name=name;
		this.qty=qty;
	}
	static class ProductFilter
	{
		public  boolean isAvailable(Product p)  //line n1
		{
			return p.qty>=10;
		}
	}
}

and the code fragment:

List<Product> products=Arrays.asList(
				new Product("MotherBoard",5),
				new Product("Speaker",20)
				);
products.stream()
		.filter(Product.ProductFilter::isAvailable)  // line n2
		.forEach(p->System.out.println(p));


Which modification enables the code fragment to print Speaker?


A) Replace line n1 with:
   public static boolean isAvailable(Product p){
   
   
B) Replace line n2 with:
   .filter(p->p.ProductFilter::isAvailable(p))
   
C) Implement Predicate in the Product.ProductFilter class and replace line n2 with
   .filter(p->p.ProductFilter.test(p))
   
D) Replace line n2 with:
   .filter(p->Product::ProductFilter::isAvailable())
   
   
ans:A
  



*/
