package io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class SimpleNetSpider {

    public static void main(String[] args) {

        try{
        	URL u = new URL("http://iosnetworkdemo.appspot.com/json.jsp?msg=helloWorld");
        	URLConnection connection = u.openConnection();
        	HttpURLConnection htCon = (HttpURLConnection) connection;
        	int code = htCon.getResponseCode();
        	BufferedReader in=new BufferedReader(new InputStreamReader(htCon.getInputStream()));
        	String inputLine;
        	while ((inputLine = in.readLine()) != null)
        		System.out.println(inputLine);
        	in.close();
          
        }
        catch(MalformedURLException e )
        { 
            System.out.println("Wrong URL");
        }
        catch(IOException e)
        {
            System.out.println("Can not connect");
        }
    }
}