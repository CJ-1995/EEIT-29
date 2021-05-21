package J1_java_Class_Design;
class ex4
{
	public static void main(String args[])
	{
		m ma=m.getM();
		m mb=m.getM();
		
		System.out.println(ma);
		System.out.println(mb);
	}
	
}
class m
{
	private m() {}
	private static m m1=new m();
	
	public static m getM()
	{
		return m1;
	}
	
}

/*
You want to create a singleton class by using the Singleton design pattern.

Which two statements enforce the singleton nature of the design?

A. Make the class static.
B. Make the constructor private.
C. Override equals() and hashCode() methods of the java.lang.Object class.
D. Use a static reference to point to the single instance.
E. Implement the Serializable interface.

*/