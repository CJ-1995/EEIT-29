package j3Generics_and_Collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ex16 {

	public static void main(String[] args) {
		List<Vehicles> vehicle=Arrays.asList(
				new Vehicles(2,"Car"),
				new Vehicles(3,"Bike"),
				new Vehicles(1,"Truck"));
		vehicle.stream()
		//.sorted((v1,v2)->Integer.compare(v1.getVid(),v2.getVid()))
		.sorted(Comparator.comparing((Vehicles v)->v.getVid()))
		.forEach(System.out::print);
	}

}
class Vehicles {
	int vId;
	String vName;
	public Vehicles(int vIdArg,String vNameArg) {
		this.vId=vIdArg;
		this.vName=vNameArg;	
	}
	
	public int getVid() {return vId;}
	public String getVName() { return vName;}
	public String toString() {
		return vName;	
	}

}

/*
Given:

public class Vehicle {
	int vId;
	String vName;
	public Vehicle(int vIdArg,String vNameArg) {
		this.vId=vIdArg;
		this.vName=vNameArg;	
	}
	
	public int getVid() {return vId;}
	public String getVName() { return vName;}
	public String toString() {
		return vName;	
	}

}

and the code fragment:

List<Vehicle> vehicle=Arrays.asList(
		new Vehicle(2,"Car"),
		new Vehicle(3,"Bike"),
		new Vehicle(1,"Truck"));

vehicle.stream()
		// line n1
		.forEach(System.out::print);
		
		
Which two code fragments, when insert at line n1 independently, enable the code to print
TruckCarBike?

A) .sorted((v1,v2)->Integer.compare(v1.getVId(),v2.getVId()))

B) .sorted(Comparable.comparing(Vehicle::getVName)).reversed()

C) .map(v->v.getVId())
   .sorted()
   
D) .sorted(Comparator.comparing((Vehicle v)->v.getVid()))

E) .sorted((v1,v2)->v1.getVId()<v2.getVId())

ans:A,D


*/