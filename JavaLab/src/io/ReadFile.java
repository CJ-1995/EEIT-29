package io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import com.sun.org.glassfish.external.amx.AMXGlassfish;
import com.sun.xml.internal.ws.Closeable;

public class ReadFile {

	public static void main(String[] args) {
		//try with resorece,
		//宣告在 try() 括號內的宣告的物件都會在 try{} 結束時執行 close()
	try (  FileInputStream fis = new FileInputStream("C:\\java\\io_1.txt");
			BufferedInputStream bis = new BufferedInputStream(fis);
			){//bina
			System.out.println("available="+bis.available());
		int data = bis.read();//FileInputStream一次只讀一個byte  BufferedInputStream 一次讀一個段落
	    char c =(char)data;  //所以只有英文單字(char) 數字 符號可以使用
	 
	    System.out.println(c);
	    	System.out.println(data);
		
	    	while ((data = bis.read()) !=-1 ) {
				System.out.print((char)data);
				
			}
	    	
	    	
	} catch (FileNotFoundException e) {
			e.printStackTrace();
	} catch (IOException e) {
			e.printStackTrace();
		} 
	} 
}


