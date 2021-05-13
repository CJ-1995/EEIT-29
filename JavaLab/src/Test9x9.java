import javax.imageio.ImageTranscoder;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class Test9x9 {

	public static void main(String[] args) {

		for(int i=1;i<=9;i++) {
		
			for(int j=1;j<=9;j++) {
			
				System.out.print(i + "X" + j +"="+ (i*j) + "\t");
			
				}
			System.out.println();
		}
//		
//	for(int i=0;i<=9;i++) {
//		for(int j=0;j<i;j++) {
//			System.out.print("*");
//		}	System.out.println();
//	}
}
}
