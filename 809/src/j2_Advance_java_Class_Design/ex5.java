package j2_Advance_java_Class_Design;

public class ex5 {
	public static void main(String args[])
	{
		Vehicle v = new Vehicle(100);
		v.increSpeed(60);
	}
	
	

}
class Vehicle {
	 
    int distance;
 
    Vehicle(int x) {
        this.distance = x;
    }
 
    public void increSpeed(int time) {
        int timeTravel = time;
        class Car { // line n1
 
            int value = 0;
 
            public void speed() {
                value = distance / timeTravel; // line n2
                System.out.println("Velocity with new speed " + value + " kmph");
            }
        }
        new Car().speed(); // line n3
    }
}
/*
Given the definition of the Vehicle class:

class Vehicle {
 
    int distance;
 
    Vehicle(int x) {
        this.distance = x;
    }
 
    public void increSpeed(int time) {
        int timeTravel = time;
        class Car { // line n1
 
            int value = 0;
 
            public void speed() {
                value = distance / timeTravel; // line n2
                System.out.println("Velocity with new speed " + value + " kmph");
            }
        }
        new Car().speed(); // line n3
    }
}

and this code fragment:

Vehicle v = new Vehicle(100);
v.increSpeed(60);
What is the result?

A.

Velocity with new speed 1 kmph

B. A compilation error occurs at line n1.
C. A compilation error occurs at line n2.
D. A compilation error occurs at line n3.


*/