package ch3_Using_Operators_and_Decision_Constructs;

public class ex12 {

	public static void main(String[] args) {
		 Z obj = new Z();
	        System.out.println(obj.x3 + ", " + obj.y1 + ", " + obj.z1);

	}

}
class X {
	 
    int x1, x2, x3;
}
 
class Y extends X {
 
    int y1;
 
    Y() {
        x1 = 1;
        x2 = 2;
        y1 = 10;
    }
}
 
class Z extends Y {
 
    int z1;
 
    Z() {
        x1 = 3;
        y1 = 20;
        z1 = 100;
    }
}

/*
Given:

class X {
 
    int x1, x2, x3;
}
 
class Y extends X {
 
    int y1;
 
    Y() {
        x1 = 1;
        x2 = 2;
        y1 = 10;
    }
}
 
class Z extends Y {
 
    int z1;
 
    Z() {
        x1 = 3;
        y1 = 20;
        z1 = 100;
    }
}
 
public class Test3 {
 
    public static void main(String[] args) {
        Z obj = new Z();
        System.out.println(obj.x3 + ", " + obj.y1 + ", " + obj.z1);
    }
}
Which constructor initializes the variable x3?

A. Only the default constructor of class X
B. Only the no-argument constructor of class Y
C. Only the no-argument constructor of class Z
D. Only the default constructor of object class



*/