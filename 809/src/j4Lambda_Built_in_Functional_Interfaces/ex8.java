package j4Lambda_Built_in_Functional_Interfaces;

import java.util.function.Predicate;

public class ex8 {

	public static void main(String[] args) {
		boolean res=new LengthValidator(){
			public boolean checkLength(String str){
				return str.length()>5&& str.length()<10;
			}
		}.checkLength("Hello");	

		boolean res2=new Predicate() 
		{

			@Override
			public boolean test(Object str) {
				// TODO Auto-generated method stub
				
				return str.toString().length()>5&& str.toString().length()<10;
			}
			
		}.test("Hello");
		
	}

}
interface LengthValidator{
	public boolean checkLength(String str);
}
/*
Given:

public interface LengthValidator{
	public boolean checkLength(String str);
}

and

public class Txt {
	public static void main(String[] args){
		boolean res=new LengthValidator(){
			public boolean checkLength(String str){
				return str.length()>5&& str.length()<10;
			}
		}.checkLength("Hello");	
	}
}

Which interface from the java.util.function package should you use to refactor the class Txt?

A) Function

B) Consumer

C) Predicate

D) Supplier

ans:C



*/