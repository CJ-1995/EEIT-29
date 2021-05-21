package j5Exceptions_and_Assertions;

public class ex9 {
	public void doRegister(String name, int age) throws UserException, AgeOutOfLimitException {
        if (name.length() < 6) {
            throw new UserException();
        } else if (age >= 60) {
            throw new AgeOutOfLimitException();
        } else {
            System.out.println("User is registered.");
        }
    }
 
    public static void main(String[] args) throws UserException {
        ex9 t = new ex9();
        t.doRegister("Mathew", 60);
    }

}
class UserException extends Exception {
}
 
class AgeOutOfLimitException extends UserException {
}
/*
Given:
class UserException extends Exception {
}
 
class AgeOutOfLimitException extends UserException {
}
and the code fragment:

class App {
 
    public void doRegister(String name, int age) throws UserException, AgeOutOfLimitException {
        if (name.length() < 6) {
            throw new UserException();
        } else if (age >= 60) {
            throw new AgeOutOfLimitException();
        } else {
            System.out.println("User is registered.");
        }
    }
 
    public static void main(String[] args) throws UserException {
        App t = new App();
        t.doRegister("Mathew", 60);
    }
}

What is the result?

A.

User is registered.

B. An AgeOutOfLimitException is thrown.
C. A UserException is thrown.
D. A compilation error occurs in the main method.


*/