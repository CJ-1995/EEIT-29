
public class Factory {
	
	//singleton design pattern
	
	private static final JDBC_Method bean=Factory();
	
	private static JDBC_Method Factory() {
		JDBC_Method bean = new JDBC_Method(); 
		return bean;
	}
	
	public static JDBC_Method getbean() {
		return bean;
	}

}
