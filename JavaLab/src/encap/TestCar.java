package encap;


public class TestCar {

	public static void main(String[] args) {

		Car c=new Car('R');
		//c.model = "Prius";
		//c.price = 1000000;
		//c.setModel("Prius");
		
		System.out.printf("型號:%s,價錢:%7d,顏色:%c",c.getModel(),c.getPrice(),c.getColor());
		
	}
}

