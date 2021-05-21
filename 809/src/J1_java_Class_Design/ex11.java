package J1_java_Class_Design;

public class ex11 {
	

}
/*
Given:
package p1;
 
public interface DoInterface {
 
    void m1(int n); // line n1
 
    public void m2(int n);
}

package p3;
public class DoClass implements DoInterface{
    int x1, x2;
    DoClass(){
        this.x1 = 0;
        this.x2 = 10;
    }
    public void m1(int p1) { x1+=p1; System.out.println(x1); } // line n2
    public void m2(int p1) { x2+=p1; System.out.println(x2); }
}

package p2;
import p1.*;
import p3.*;
 
class Test {
 
    public static void main(String[] args) {
        DoInterface doi = new DoClass(); // line n3
        doi.m1(100);
        doi.m2(200);
    }
}

What is the result?

A.

100
210

B. Compilation fails due to an error in line n1
C. Compilation fails due to an error at line n2
D. Compilation fails due to an error at line n3
*/