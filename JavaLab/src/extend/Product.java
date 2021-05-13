package extend;

public abstract class Product {
	//抽象類別 不一定會有抽象方法 
	//有抽象方法 必為抽象類別
//	public abstract void calc();
	
	public static final double TAX;//系統常數通常使用全大寫!!! 
		static {  
			TAX = 0.05;
			//System.out.println("static black");
	}
	
	String name;
	int price;
	 
	public Product() {
	}

	public Product(String name, int price) {
		this.name = name;
		this.price = price;
}
	
	
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String desc() {
		return	 String.format("名稱:%s,價錢:%d", name,price) ;
	}
	
	
}

