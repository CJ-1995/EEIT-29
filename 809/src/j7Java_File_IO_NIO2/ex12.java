package j7Java_File_IO_NIO2;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ex12 {

	public static void main(String[] args) {
		Path path1=Paths.get("/software/././sys/readme.txt");
		Path path2=path1.normalize();///software/sys/readme.txt
		Path path3=path2.relativize(path1);
		System.out.print(path1.getNameCount());
		System.out.print(":"+path2.getNameCount());
		System.out.print(":"+path3.getNameCount());

	}

}
/*
Given the code fragment:

Path path1=Paths.get("/software/././sys/readme.txt");
Path path2=Path1.normalize();
Path path3=path2.relativize(path1);
System.out.print(path1.getNameCount());
System.out.print(":"+path2.getNameCount());
System.out.print(":"+path3.getNameCount());

What is the result?

A)6:5:6
B)3:3:4
C)4:4:4
D)5:3:6

ans:D
*/