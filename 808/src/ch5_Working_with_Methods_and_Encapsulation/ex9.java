package ch5_Working_with_Methods_and_Encapsulation;

public class ex9 {

	public static void main(String[] args) {
		String[] x= { "1","2"};
		Alpha main = new Alpha(x);
	        main.main();
		
		

	}

}
class Alpha {
	 
    public String[] main = new String[2];
 
    Alpha(String[] main) {
        for (int ii = 0; ii < main.length; ii++) {
            this.main[ii] = main[ii] + 5;
        }
    }
 
    public void main() {
        System.out.print(main[0] + main[1]);
    }
}

/*
Give:

Test.java
class Alpha {
 
    public String[] main = new String[2];
 
    Alpha(String[] main) {
        for (int ii = 0; ii < main.length; ii++) {
            this.main[ii] = main[ii] + 5;
        }
    }
 
    public void main() {
        System.out.print(main[0] + main[1]);
    }
}
 
public class Test {
 
    public static void main(String[] args) {
        Alpha main = new Alpha(args);
        main.main();
    }
}
And the commands:

javac Test.java
java Test 1 2

What is the result?

A.

1525

B.

13

C. Compilation fails
D. An exception is thrown at runtime
E. The program fails to execute due to runtime error



*/