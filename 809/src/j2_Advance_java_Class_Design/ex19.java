package j2_Advance_java_Class_Design;

public class ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*
Which class definition complies?

A)class Vehicle{
	int id;
	public void start() {
		public class Engine{int eNo=id;}
	}
}

B)class Product{
	interface Moveable{	void move();}
	Moveable mProduct=new Moveable() {
		void move() {};
	};
}

C)class Block{
	int bno;
	static class Counter{
		int locator;
		Counter(){locator=bno;}
	}
}


D)class Computer{
	private Card sCard=new SoundCard();
	private abstract class Card{}
	private class SoundCard extends Card{}
}

ans:D
*/