
public class TestString {
	public static void main(String[] args) {
		
		String name="vincent"; 
		//pool會產生vincent字,回傳記憶體位置給name變數
		
		String name1="vincent";
		//第二次再要,pool直接回傳vincent記憶體位置給name1,不會再產生新字
		
		String name2=new String("vincent");
		//new會產生再heap區 不會在pool內
		
		System.out.println(name==name1);
						// == 比較記憶體位置	
		System.out.println(name2==name1);
					//heap(new) != pool
		
		System.out.println("equals="+name2.equals(name2));
		                  //equals 是文字逐字比較
	
		System.out.println("中文abc".length());
		
		System.out.println("中文abc".indexOf("a"));
		//第一個字的位置是從0 開始算, 找不到救回傳-1
	
		System.out.println("中文abc".contains("文1"));
		//找contains()中的字  trur or false
		
		System.out.println("中文abc".substring(1));
		//從substring()中的數字 開始截字
	
		System.out.println("中文abc".substring(1,3));
		//從substring(1,3)中的數字 從1開始截字 到3

//-----------------------String.format------------------------
		
		System.out.println(String.format("Hello Words%10s", "David"));
		
		System.out.println(String.format("%.4s", 10/3.0));
		// %.4f, 表示小數點後4位,自動四捨五入
	
		System.out.println(String.format("aaa bbb %12d%%", 10));
		
		System.out.printf("aaa bbb %12d%%", 10); //f:format

	
	}
	
}
