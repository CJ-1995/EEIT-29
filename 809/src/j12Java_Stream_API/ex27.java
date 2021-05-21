package j12Java_Stream_API;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ex27 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Stream<String> stream=Files.lines(Paths.get("c:/ocp/customers.txt"));
		   stream.forEach(c->System.out.println(c));
	}

}
/*
Assume customers.txt is accessible and contains multiple lines.

Which code fragment prints the contents of the customers.txt file?

A) Stream<Path> stream=Files.list(Paths.get("customers.txt"));
   stream.forEach(c->System.out.println(c));
   
B) Stream<Path> stream=Files.find(Paths.get("customers.txt"));
   stream.forEach(c->System.out.println(c));
   
C) Stream<String> lines=Files.lines(Paths.get("customers.txt"));
   lines.forEach(c->System.out.println(c));
   
D) Stream<String> stream=Files.find(Paths.get("customers.txt"));
   stream.forEach((String c)->System.out.println(c));


ans:C

*/