package j2_Advance_java_Class_Design;

public class ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

/*
Given the content of Opeator.java, EngineOperator.java, and Enjine.java files:

Operator.java:
public abstract class Operator{
	protected void turnON();
	protected void turnOFF();

}

EngineOperator.java
public class EngineOperator extends Operator{
	public final void turnON(){System.out.println("NO "); }
	public final void turnOFF(){System.out.println("OFF"); }
}

Engine.java:
public class Engine{
	Operator m=new EngineOperator();
	public void operate(){
		m.turnON();
		m.turnOFF();	
	}
}


and the code fragment:
Engine carEngine=new Engine();
carEngine.operate();

What is the result?

A) The EngineOperator.java files fails to compile.
B) ON OFF
C) The Operator.java file fails to compile.
D) The Engine.java file fails to compile.


ans:C




*/