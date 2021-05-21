package j5Exceptions_and_Assertions;

public class ex3 {

}
/*
iven:
class RateOfInterest {
 
    public static void main(String[] args) {
        int rateOfInterest = 0;
        String accountType = "LOAN";
        switch (accountType) {
            case "RD":
                rateOfInterest = 5;
                break;
            case "FD":
                rateOfInterest = 10;
                break;
            default:
                assert false : "No interest for this account"; //line n1
        }
        System.out.println("Rate of interest:" + rateOfInterest);
    }
}
and the command:

java -ea RateOfInterest

What is the result?

A.

Rate of interest: 0

B. An AssertionError is thrown.
C.

No interest for this account

D. A compilation error occurs at line n1.
*/