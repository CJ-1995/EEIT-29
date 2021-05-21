package j6Java_IO_Fundamentals;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ex4 {

	public static void main(String[] args) throws IOException  {
		BufferedReader br=new BufferedReader(new FileReader("c:/java/data.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("c:/java/alldata.txt"));
		String line=null;
		while((line=br.readLine()) !=null) {
			bw.append(line+"\n");
		
		}
		
		// line n1
		bw.flush();
		

	}

}
/*
Given that data.txt and alldata.txt are accessible, and the code fragment:

public void writeFiles() throws IOException {
	BufferedReader br=new BufferedReader(new FileReader("data.txt"));
	BufferedWriter bw=new BufferedWriter(new FileWriter("alldata.txt"));
	String line=null;
	while((line=br.readLine()) !=null) {
		bw.append(line+"\n");
	
	}
	
	// line n1

What is required at line n1 to enable the code to overwrite alldata.txt with data.txt?

A) bw.writeln();

B) bw.flush();

C) br.close();

D) br.flush();

ans:B







}
*/
