package J1_java_Class_Design;

public class ex3 {

}
/*
Given:

abstract class Shape {
    Shape() { System.out.println("Shape"); }
    protected void area() { System.out.println("Shape"); }
}
 
class Square extends Shape {
    int side;
    Square(int side) {
         //insert code here ...line9
        this.side = side;
    }
    public void area() { System.out.println("Square"); }
}
class Rectangle extends Square {
    int len, br;
    Rectangle(int x, int y) {
        //insert code here ...lin17
        len = x; br = y;
    }
    void area() { System.out.println("Rectangle"); }...lin20
}
Which two modifications enable the code to compile?

A. At line 1, remove abstract
B. At line 9, insert super();
C. At line 12, remove public
D. At line 17, insert super(x);
E. At line 17, insert super(); super.side = x;
F. At line 20, use public void area () {


*/