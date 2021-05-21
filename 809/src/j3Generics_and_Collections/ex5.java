package j3Generics_and_Collections;

public class ex5<T> {
	private T t;
	 
    public T get() {
        return t;
    }
 
    public void set(T t) {
        this.t = t;
    }
 
    public static void main(String args[]) {
        ex5<String> type = new ex5<>();
        ex5 type1 = new ex5(); //line n1
        type.set("Java");
        type1.set(100); //line n2
        System.out.print(type.get() + " " + type1.get());
    }
	

}
/*
Given:

public class Test<T> {
 
    private T t;
 
    public T get() {
        return t;
    }
 
    public void set(T t) {
        this.t = t;
    }
 
    public static void main(String args[]) {
        Test<String> type = new Test<>();
        Test type1 = new Test(); //line n1
        type.set("Java");
        type1.set(100); //line n2
        System.out.print(type.get() + " " + type1.get());
    }
}
What is the result?

A.

Java 100

B.

java.lang.string@java.lang.Integer@

C. A compilation error occurs. To rectify it, replace line n1 with:
Test<Integer> type1 = new Test<>();

D. A compilation error occurs. To rectify it, replace line n2 with:
type1.set(Integer(100));

*/