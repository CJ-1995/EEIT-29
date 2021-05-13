package interFace;

public class Notebook extends Product implements Warrantable{
	//Notebook 具備三種型態: Notebook ,Product ,Warrantable
	
	public int warranty;
	
	public Notebook(String name,int price,int warranty) {
//		super(); // 當你沒有呼叫父類別建構時 compiler 會自動加
		super(name,price);  //呼叫父類別的建構方法 
//		this.name = name;
//		this.price = price;
		this.warranty = warranty;
//		setName(name);
//		setPrice(price);
	}
	
	@Override
	public int 保固天數() {
		// TODO Auto-generated method stub
		return warranty;
	}
	// @ annotation 註記 
	@Override
	public String desc() {
		String info = super.desc();//名稱:%s,價錢:%d
			return	 String.format("%s,保固:%d天",info,warranty) ;
	}               
	
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
}

