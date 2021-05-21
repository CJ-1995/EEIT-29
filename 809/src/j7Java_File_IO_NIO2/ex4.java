package j7Java_File_IO_NIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class ex4 {
	public static void main(String args[]) throws IOException
	{
		System.out.println(System.getProperty("user.home"));
		System.out.println(Paths.get(System.getProperty("user.home")));
		System.out.println(Files.walk(Paths.get(System.getProperty("user.home"))));
		Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));
		/*files.forEach(fName->
		System.out.println(fName));*/
		
		files.forEach(fName -> { //line n1
		    try {
		        Path aPath = fName.toAbsolutePath(); //line n2
		        System.out.println(fName + ":"
		                + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
		    } catch (IOException ex) {
		        ex.printStackTrace();
		    }
		});
		
	}
	

}
/*
Given the code fragment:
Stream<Path> files = Files.walk(Paths.get(System.getProperty("user.home")));
files.forEach(fName -> { //line n1
    try {
        Path aPath = fName.toAbsolutePath(); //line n2
        System.out.println(fName + ":"
                + Files.readAttributes(aPath, BasicFileAttributes.class).creationTime());
    } catch (IOException ex) {
        ex.printStackTrace();
    }
});
What is the result?

A. All files and directories under the home directory are listed along with their attributes.
B. A compilation error occurs at line n1.
C. The files in the home directory are listed along with their attributes.
D. A compilation error occurs at line n2.


*/