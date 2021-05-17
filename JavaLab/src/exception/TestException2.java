package exception;

import java.io.File;
import java.io.FileNotFoundException;

public class TestException2 {

	public static void main(String[] args) {

		try {
			checkFile("c:\\java\\aaa.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("done");
	
}
	public static void checkFile(String filePath) throws FileNotFoundException {
		
		File file = new File(filePath);
		if(!file.exists()) {
//			FileNotFoundException fne = new FileNotFoundException(filePath);
//			throw fne;
			throw  new FileNotFoundException(filePath+" 阿就找不到咩");
			//System.out.println("a");<== 不會被執行到
		}
		
	}
}
