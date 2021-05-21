package j6Java_IO_Fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1 {
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    System.out.print("Enter GDP: ");
	    int GDP = Integer.parseInt(br.readLine());
	    //int GDP = br.read();
	    
	    System.out.println(GDP);
	}
	
	

}
/*
Given the code fragment:

public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Enter GDP: ");
    //line 1
}


Which code fragment, when inserted at line 1, enables the code to read the GDP from the user?

A.
int GDP = Integer.parseInt(br.readLine());

B.
int GDP = br.read();

C.
int GDP = br.nextInt();

D.
int GDP = Integer.parseInt(br.next());


*/