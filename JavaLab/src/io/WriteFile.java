package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {

		try(FileOutputStream foS = new FileOutputStream("C:\\java\\io_1.txt");
				BufferedOutputStream bos = new BufferedOutputStream(foS)
				){
			
			String cotent = "中文ABC";
			bos.write(cotent.getBytes()); //
			System.out.println("Finish");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
