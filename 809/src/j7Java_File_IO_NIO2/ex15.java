package j7Java_File_IO_NIO2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex15 {

	public static void main(String[] args) throws IOException {
		Path source=Paths.get("/data/december/log.txt");
		Path destination=Paths.get("/data/a.txt");
		Files.copy(source,destination);
		

	}

}
/*
Given the code fragment:

Path source=Paths.get("/data/december/log.txt");
Path destination=Paths.get("/data");
Files.copy(source,destination);

and assuming that the file /data/december/log.txt is accessible and contains:

10-Dec-2014-Executed successfully

What is the result?


A) FileAlreadyExistsException is thrown at run time.

B) The program executes successfully and does NOT change the file system.

C) A file with the name log.txt is created in the /data directory and content of
   the /data/december/log.txt file is copied to it
   
D) A FileNotFoundException is thrown at run time.

ans:A


*/