package io.reader;

import java.io.*;
import java.nio.charset.Charset;

public class ReadByFileReader {
    public static void main(String[] args) throws IOException {

        System.out.println("目前JVM編碼＝"+Charset.defaultCharset());
        //
//      File file = new File("C:\\java\\char_UTF8.txt");
        File file = new File("C:\\java\\char_MS950.txt");
        try(
        		FileInputStream fis = new FileInputStream(file);
        		InputStreamReader isr = new InputStreamReader(fis,"Ms950");
           		BufferedReader br = new BufferedReader(isr);
        		){  

        	/* 一個字一個字一個字一個字讀
                int c;
                while ((c = isr.read()) != -1) {
                    System.out.println((char) c);
                }
                */ //一次讀一行 邱
        		String line;
        		while((line = br.readLine())!=null) {
        			System.out.println(line);
        		}
        	
            //}

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
