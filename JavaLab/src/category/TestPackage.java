package category;
//import category.Item; //只引用單一類別

//import category.*; //引用category中的所有類別

public class TestPackage {

	public static void main(String[] args) {

		//在 package 下的類別 必須使用全名!

		//(沒有 import的狀況下)
		//category.Item item =new category.Item();
		
		Item item =new category.Item();
		item.name="Asus notebook";
		System.out.println("TestPackage's main"+item.name);
	}

}
