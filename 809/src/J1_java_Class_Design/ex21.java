package J1_java_Class_Design;

public class ex21 {
	
	

}


/*
Given:
class Alpha {
 
    int ns;
    static int s;
 
    Alpha(int ns) {
        if (s < ns) {
            s = ns;
            this.ns = ns;
        }
    }
 
    void doPrint() {
        System.out.println("ns = " + ns + " s = " + s);
    }
}
 
public class TestA {
 
    public static void main(String[] args) {
        Alpha ref1 = new Alpha(50);
        Alpha ref2 = new Alpha(125);
        Alpha ref3 = new Alpha(100);
        ref1.doPrint();
        ref2.doPrint();
        ref3.doPrint();
    }
}

What is the result?

A.

ns = 50 s = 125
ns = 125 s = 125
ns = 100 s = 125

B.

ns = 50 s = 125
ns = 125 s = 125
ns = 0 s = 125

C.

ns = 50 s = 50
ns = 125 s = 125
ns = 100 s = 100

D.

ns = 50 s = 50
ns = 125 s = 125
ns = 0 s = 125


*/