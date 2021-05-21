package j8Java_Concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.atomic.AtomicInteger;
//�䴩thread-safe,���Nsynchronized , lock
public class ex6 {

	public static void main(String[] args) {
		final List<String> list=new CopyOnWriteArrayList<>();//�PArrayList�@��
		final AtomicInteger ai=new AtomicInteger(0);//Integer��l��
		final CyclicBarrier barrier=new CyclicBarrier(1,new Runnable(){//�`���ϥ�
			public  void run(){ System.out.println(list);}
		});

		Runnable r=new Runnable(){
			public void run(){
				try{
					Thread.sleep(1000*ai.incrementAndGet());
					list.add("X");
					barrier.await();
						
				}catch(Exception ex){
				
				}	
			}
		};


		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();
		new Thread(r).start();

	}

}
/*
Given the code fragment:

final List<String> list=new CopyOnWriteArrayList<>();
final AtomicInteger ai=new AtomicInteger(0);
final cyclicBarrier barrier=new cyclicBarrier(2,new Runnable(){
	public  void run(){ System.out.println(list);}
});

Runnable r=new Runnable(){
	public void run(){
		try{
			Thread.sleep(1000*ai.incrementAndGet());
			list.add("X");
			barrier.await();
				
		}catch(Exception ex){
		
		}	
	}
};


new Thread(r).start();
new Thread(r).start();
new Thread(r).start();
new Thread(r).start();

What is the result?

A) [x]
   [x,x]
   [x,x,x]
   [x,x,x,x]
   
B) [x]
   [x,x]
   [x,x,x]
   
C) [x,x]

D) [x,x]
   [x,x,x,x]
   
   
ans:D


*/