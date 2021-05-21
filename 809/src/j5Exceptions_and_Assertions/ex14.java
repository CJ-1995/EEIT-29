package j5Exceptions_and_Assertions;

public class ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
/*
class Engine{
	double fueLevel1;
	Engine(int fueLevel){this.fueLevel=fueLevel;}
	public void start(){
		//line n1
		System.out.println("Started");
	}
	
	public void stop(){ System.out.println("Stopped");}

}

Your design requires that
	.fuelLevel of Engine must be greater than zero when the start() method is invoked.
	.The code must teminate if fuelLevel of Engine is less than or equal to zero.
Which code fragment should be added at line n1 to express this invariant codition?

A)assert fuelLevel<0:System.exit(0);
B)assert (fuelLevel>0):System.out.println("Impossible fuel");
C)assert (fuelLevel):"Terminating....";
D)assert fuelLevel>0:"Impossible fuel";

ans:D
*/