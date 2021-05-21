package j5Exceptions_and_Assertions;

public class ex5 {
	
}
/*
Given the code fragments:

void doStuff() throws ArithmeticException, NumberFormatException, Exception {
    if (Math.random() > -1) throw new Exception ("Try again");
}

and

try {
    doStuff();
} catch (ArithmeticException | NumberFormatException | Exception e) {
    System.out.println(e.getMessage());
} catch (Exception e) {
    System.out.println(e.getMessage());
}
Which modification enables the code to print Try again?

A. Comment the lines 28, 29 and 30.

B. Replace line 26 with:
} catch (Exception | ArithmeticException | NumberFormatException e) {

C. Replace line 26 with:
} catch (ArithmeticException | NumberFormatException e) {

D. Replace line 27 with:
throw e;


*/