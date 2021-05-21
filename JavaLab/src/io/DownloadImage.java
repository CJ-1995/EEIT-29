package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class DownloadImage {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://graph.facebook.com/AppStore/picture?type=large");
						//網址不可以有中文
		try(InputStream opStream = url.openStream();
				BufferedInputStream bis =new BufferedInputStream(opStream);
				
				FileOutputStream fos = new FileOutputStream("C:\\java\\圖.jpg");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				){
			byte[] buffer = new byte[1024];
			int length;
			while((length = bis.read(buffer)) !=-1 ) {
				System.out.println(length);
				bos.write(buffer,0,length);
			}
			
		}
		System.out.println("Finish");
	}

}
