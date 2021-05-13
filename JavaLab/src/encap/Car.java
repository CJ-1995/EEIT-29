package encap;

public class Car {
	//Constructor 建構方法 
	public Car(char c) {
		this("Yaris", c); //this()呼叫另一個建構方法 只能建構方法下的第一行
		//color = c;
	}  
	//Overload Constructor 
		public Car(String model,char color) {
		//this.model = model;
		setModel(model);
		this.color = color;
		}


	private String model;
	private int price;
	private char color;
	
//---------------setter-----------------
	
	public void setColor(char color) {
		this.color = color;
	}
	public void setModel(String model) {
		this.model = model;
		if(model.equals("Yaris")) {
			this.price = 575000;
	}else if(model.equals("Prius")){
		this.price = 1099000;
		}else {
			System.out.println("Error:錯誤型號");
		}
	}
	
//----------getter------------------
	
	public char getColor() {
		return color;
	}
	public int getPrice() {
		return price;
			}
	public String getModel() {
		return model;
	}
}
	
	

