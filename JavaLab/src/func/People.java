package func;

public class People {
//----------static 無法使用物件屬性,方法-------
	//定義 常數 表示過重 
	static double overWeight =24.0;
	
	public static double BMI(double h,double w) {
		return w/(h * h);
	}
	
//----------下方都是物件的屬性與方法 都需要new才能使用------
	//物件 的 屬性
	double height;
	double weight;
	
	//物件 的 方法  適合用在參數多,且狀態需要保留的時候
	public double getBMI() {
//		double BMI = weight / (height * height);
		double BMI = People.BMI(height, overWeight);
					//物件方法可以呼叫類別方法 
		return BMI;
	}
}
