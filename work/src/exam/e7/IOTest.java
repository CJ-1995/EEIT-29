package exam.e7;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
import java.net.*; 

public class IOTest {
    public static void main(String[] args) throws MalformedURLException {
    		/* 
    		 http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld，
    		會回應{"msg":"helloWorld","狀 態":"成功"}，編碼為UTF8 
    	    請利用Java程式呼叫此網址，此將此網址回傳的結果示在Console中(IOTest.java)
    	    程式中除了MalformedURLException其它 Exception處理必須使用try catch不能直接由方法抛出。
    	    所有IO都必須close
           */
    	String a = null; 
    	try { 
    	String url = "http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld"; 
    	BufferedReader in = new BufferedReader(
    			new InputStreamReader( 
    	new URL(url).openConnection().getInputStream(), "UTF8"));
    	
    	while ((a = in.readLine()) != null) { 
    	System.out.println(a); 
    	}
    	in.close();
    	} catch (MalformedURLException e) { 
    		e.getStackTrace();
    	} catch (IOException e) {
    		e.getStackTrace();
    	} 
    } 
    	
 }

