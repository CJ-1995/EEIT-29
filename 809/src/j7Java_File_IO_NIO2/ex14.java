package j7Java_File_IO_NIO2;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ex14 {

	public static void main(String[] args) throws IOException   {
		// TODO Auto-generated method stub
		//Stream<Path> stream=Files.list(Paths.get("/company"));
		Stream<Path> stream=Files.walk(Paths.get("/company"));
		stream.forEach(s->System.out.println(s)); 
	}

}
/*
Given that these files exist and are accessible:

/company/emp/info.txt
/company/emp/benefits/b1.txt

and given the code fragment:

// line n1
stream.forEach(s->System.out.print(s)); 
 
Which code fragment can be inserted at line n1 to enable the code to print only /company/emp?


A) Stream<path> stream=Files.list(Paths.get("/company/emp"));

B) Stream<Path> stream=Files.list(Paths.get("/company"));

C) Stream<Path> stream=Files.find(
		Paths.get("/company"),1,
		(p,b)->b.isDirectory(), FileVisitOption.FOLLOW_LINKS);
		
D) Stream<Path> stream=Files.walk(Paths.get("/company"));



ans:B
*/