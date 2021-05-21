package j5Exceptions_and_Assertions;

public class ex8 {
	public static void main(String args[])
	{
		try (ImageScanner ir = new ImageScanner();
		        ImagePrinter iw = new ImagePrinter()) {
		   ir.scanImage();
		    iw.printImage();
		} catch (Exception e) {
		    System.out.print(e.getMessage());
		}
	}
	

}
class ImageScanner implements AutoCloseable {
	 
    public void close() throws Exception {
        System.out.print("Scanner closed. ");
    }
 
    public void scanImage() throws Exception {
        System.out.print("Scan.");
       throw new Exception("Unable to scan. ");
    }
}
 
class ImagePrinter implements AutoCloseable {
 
    public void close() throws Exception {
        System.out.print("Printer closed. ");
    }
 
    public void printImage() {
        System.out.print("Print.");
    }
}

/*
Given:
class ImageScanner implements AutoCloseable {
 
    public void close() throws Exception {
        System.out.print("Scanner closed. ");
    }
 
    public void scanImage() throws Exception {
        System.out.print("Scan.");
        throw new Exception("Unable to scan. ");
    }
}
 
class ImagePrinter implements AutoCloseable {
 
    public void close() throws Exception {
        System.out.print("Printer closed. ");
    }
 
    public void printImage() {
        System.out.print("Print.");
    }
}
and this code fragment:

try (ImageScanner ir = new ImageScanner();
        ImagePrinter iw = new ImagePrinter()) {
    ir.scanImage();
    iw.printImage();
} catch (Exception e) {
    System.out.print(e.getMessage());
}
What is the result?

A.

Scan.Printer closed. Scanner closed. Unable to scan.

B.

Scan.Scanner closed. Unable to scan.

C.

Scan. Unable to scan.

D.

Scan. Unable to scan. Printer closed.


*/