package j3Generics_and_Collections;

public class ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}

/*
Given:

public class Foo<K,V> {
	private K key;
	private V value;
	
	public Foo(K key,V value) { this.key=key; this.value=value;}
	
	public static<T> Foo<T,T> twice(T value) { return new Foo<T,T>(value,value);}
	
	
	public K getKey() { return key; }
	public V getValue() { return value; }

}

Which optional fails?

A) Foo<String, String> grade=new Foo<>("John","A");

B) Foo<String,Integer> mark=new Foo<String,Integer>("Steve",100);

C) Foo<Object,Object> percentage=new Foo<String,Integer>("Steve",100);

D) Foo<String,String> pair=Foo.<String>twice("Hello world!");

Ans:C

*/