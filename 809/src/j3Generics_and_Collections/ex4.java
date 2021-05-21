package j3Generics_and_Collections;

import java.util.Set;
import java.util.TreeSet;

public class ex4 {
	public static void main(String args[])
	{
		Set<Vehicle> vehicles = new TreeSet<>();
		vehicles.add(new Vehicle(10123, "Ford"));
		vehicles.add(new Vehicle(10124, "BMW"));
		System.out.println(vehicles);
	}

}
class Vehicle implements Comparable<Vehicle>{
	 
    int vno;
    String name;
 
    public Vehicle(int vno, String name) {
        this.vno = vno;
        this.name = name;
    }
 
    public String toString() {
        return vno + ":" + name;
    }

	@Override
	public int compareTo(Vehicle o) {
		
		return this.vno-o.vno;
	}
}
/*
class Vehicle {
 
    int vno;
    String name;
 
    public Vehicle(int vno, String name) {
        this.vno = vno;
        this.name = name;
    }
 
    public String toString() {
        return vno + ":" + name;
    }
}
and this code fragment:


Set<Vehicle> vehicles = new TreeSet<>();
vehicles.add(new Vehicle(10123, "Ford"));
vehicles.add(new Vehicle(10124, "BMW"));
System.out.println(vehicles);
What is the result?

A.

10123:Ford
10124:BMW

B.

10124:BMW
10123:Ford

C. A compilation error occurs.
D. A ClassCastException is thrown at run time.

*/