package ch1_javaBasic;

public class ex9 {

	public static void main(String[] args) {
		

	}

}
class Circle {
	 
   private  double radius;
    private double area;
 
    public Circle(double r) {
        radius = r;
    }
 
    public double getRadius() {
        return radius;
    }
 
    public void setRadius(double r) {
        radius = r;
    }
 
    public double getArea() {
        return 0.0;
    }
}
/*
public class Circle {
 
    double radius;
    public double area;
 
    public Circle(double r) {
        radius = r;
    }
 
    public double getRadius() {
        return radius;
    }
 
    public void setRadius(double r) {
        radius = r;
    }
 
    public double getArea() {
        return;
    }
}
 
class App {
 
    public static void main(String[] args) {
        Circle c1 = new Circle(17.4);
        c1.area = Math.PI * c1.getRadius() * c1.getRadius();
    }
}

The class is poorly encapsulated. You need to change the circle class to compute and return the area instead.

Which two modifications are necessary to ensure that the class is being properly encapsulated?

A. Remove the area field.
B. Change the getArea( ) method as follows:

public double getArea ( ) { return Match.PI * radius * radius; }
C. Add the following method:

public double getArea ( ) {area = Match.PI * radius * radius; }
D. Change the cacess modifier of the SerRadius ( ) method to be protected.




*/