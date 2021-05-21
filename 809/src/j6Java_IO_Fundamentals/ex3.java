package j6Java_IO_Fundamentals;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(
				FileInputStream fis=new FileInputStream("c:/java/version.txt");
				InputStreamReader isr=new InputStreamReader(fis);
				BufferedReader br=new BufferedReader(isr);)
		{
			if(br.markSupported())
			{
				System.out.print((char)br.read());
				br.mark(2);
				System.out.print((char)br.read());
				br.reset();
				System.out.print((char)br.read());
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
/*

Given that version.txt is accessible and contains:

1234567890

and given the code fragment:

	try(
				FileInputStream fis=new FileInputStream("c:/java/version.txt");
				InputStreamReader isr=new InputStreamReader(fis);
				BufferedReader br=new BufferedReader(isr);)
		{
			if(br.markSupported())
			{
				System.out.print((char)br.read());
				br.mark(2);
				System.out.print((char)br.read());
				br.reset();
				System.out.print((char)br.read());
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

What is the result?

A) 122

B) 135

C) The program prints nothing

D) 121

ans:A


*/