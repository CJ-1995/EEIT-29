package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.zip.ZipException;

public class TestCheckedException {

	public static void main(String[] args) throws IOException {
			//可以用兩個反斜線 \\ or 單斜線作為目錄區隔符號 / 
			FileReader fr = new FileReader("c:\\java\\aHelloWorld.java");
			//FileReader fr = new FileReader("c:/java/aaa.txt");
			//ctrl + 1 = fix
		
		System.out.println("done");
		
	}

}
