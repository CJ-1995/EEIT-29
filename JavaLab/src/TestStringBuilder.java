
public class TestStringBuilder {

	public static void main(String[] args) {
		
		String hello = "hello";		
		String word  = "word";		
		String helloword = "helloword";//Pool區
		

		String hw = hello + word; //Heap區
//		hw=new String("helloword"); 
				
		System.out.println(hw == helloword);

//--------------大量文字串接-----------------
		
		String temp = "";
		for(int i=0 ; i < 10 ; i++) {
			temp= temp + i;
			//i=0, temp=""+0="0"
			//i=1, temp="0"+1="01"
			//...每相加一次,就會產生一個心得文字
		}
		System.out.println(temp);

		
		StringBuilder builder =new StringBuilder();
		for(int i=0 ; i < 10 ; i++) {
			builder.append(i);
			//文字直接相加 不會重複製造
		}
		System.out.println(builder.toString());
	}

}
