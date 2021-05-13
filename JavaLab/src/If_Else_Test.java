
public class If_Else_Test {

	public static void main(String[] args) {
////--------------普通------------
//		int age = 26;
//		if( age >= 18 ) 
//			System.out.println("成年");
//		
//		else if( age >= 30 ) 
//			System.out.println("壯年");
//		
//		else 
//			System.out.println("未成年");
//	
////--------------巢狀------------
//{
//		if (age >= 18) {
//
//			if (age >= 30) {
//				System.out.println("壯年");
//			}else {
//				System.out.println("成年");
//							}
//
//		} else {
//			System.out.println("未成年");
//		}
//		}
//--------------Switch------------
	int classroom=205;
		switch (classroom) {
			case 205:
				System.out.println("人數40人");
				break;
			case 305:
				System.out.println("人數小於30人");
				break;
			default:
				System.out.println("不知道你在說哪一間?");
		}
	
	}
}
