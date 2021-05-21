package j7Java_File_IO_NIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ex10 {

	public static void main(String[] args) {
		
		try
		{
			List<String> content=Files.readAllLines(Paths.get("c:/java/employee.txt"));
			content.stream().forEach(line->{
				try{
					Files.write(
						Paths.get("allemp.txt"),
						line.getBytes(),
						StandardOpenOption.APPEND
						);
				}catch(IOException e){ System.out.println("Exception 1");}
				
				});
		}catch(IOException e){ System.out.println("Exception 2");}
	}

}
/*
Given the content of the employee.txt file:
Every worker is a master.

Given that the employee.txt file is accessible and the file allemp.txt does NOT exist,and the code
frament:

try
{
	List<String> content=Files.readAllLines(Paths.get("c:/java/employee.txt"));
	content.stream().forEach(line->{
		try{
			Files.write(
				Paths.get("allemp.txt"),
				line.getBytes(),
				StandardOpenOption.APPEND
				);
		}catch(IOException e){ System.out.println("Exception 1");}
		
		});
}catch(IOException e){ System.out.println("Exception 2");}


What is the result?
A)allemp.txt is created and the content of employee.txt is copied to it.
B)Exception 1
C)Exception 2
D)The program executes, does NOT affect the system, and produces NO output.

ans:B
*/