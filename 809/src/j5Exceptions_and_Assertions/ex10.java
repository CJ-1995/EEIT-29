package j5Exceptions_and_Assertions;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ex10 {
	public static void main(String[] args){
	    int i;
	    char c;
	    try (FileInputStream fis = new FileInputStream("c:/home/magiclencourse.txt");
	            InputStreamReader isr = new InputStreamReader(fis);) {
	        while (isr.ready()) { //line n1
	            isr.skip(2);
	            i = isr.read();
	            c = (char) i;
	            System.out.print(c);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	

}
/*
Given that course.txt is accessible and contains:

Course::Java
public static void main(String[] args){
    int i;
    char c;
    try (FileInputStream fis = new FileInputStream("/home/magiclencourse.txt");
            InputStreamReader isr = new InputStreamReader(fis);) {
        while (isr.ready()) { //line n1
            isr.skip(2);
            i = isr.read();
            c = (char) i;
            System.out.print(c);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}
What is the result?

A. ur :: va
B. ueJa
C. The program prints nothing.
D. A compilation error occurs at line n1.



*/