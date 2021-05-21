package thread;



public class TestThread {

	public static void main(String[] args) {
		/*
		MyThread t1 = new MyThread();
		t1.setName("倒數執行續");
		t1.start();
		*/
		//中止 JVM
//		System.exit(0);    
//		Runtime.getRuntime().exit(0);
		/*
		Thread t2 = new Thread( new Runnable() {
			@Override
			public void run() {
				for(int i = 5 ; i > 0 ; i--) {
					//Thread.currentThread() 可以取得目前執行得執行續物件
					System.out.println("倒數:"+i+","+Thread.currentThread());
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println("執行結束");
			}
		});
		*/
		//lamdba 語法版
		Thread t2 = new Thread( () ->{
			for(int i = 5 ; i > 0 ; i--) {
				//Thread.currentThread() 可以取得目前執行得執行續物件
				System.out.println("倒數:"+i+","+Thread.currentThread());
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println("執行結束");
		});
		
		
		
		
		
		t2.setName("Runable倒數");
		t2.setPriority(0);//設定執行緒權重 1-10 越高越優先執行
		//t2.setDaemon(true);  //設定成為背景執行緒 JAVA不會等他執行完就先結束了 讓他自己跑
		t2.start();
		try {
			t2.join();  //等待t2執行緒 執行結束 再繼續往下 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(Thread.currentThread());
		System.out.println("t2 isAlive"+t2.isAlive());	//查看執行續現在是否執行中
		System.out.println("Main方法結束");
	    
	
	}
}

