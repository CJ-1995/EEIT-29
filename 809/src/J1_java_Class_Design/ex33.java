package J1_java_Class_Design;

import java.io.IOException;

public class ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}


/*

Given the code fragment:

public class Video {
	public void play() throws IOException {
		System.out.print("video played.");
	}
}

public class Game extends Video {
	public void play() throws Exception {
		super.play();
		System.out.print("Game played.");	
	}
}

and

try{
	new Game().play();
} catch(Exception e) {
	System.out.print(e.getClass());
}

What is the result?

A) class java.lang.Exception

B) A compilation error occurs.

C) class java.io.IOException

D) Video played.Game played

ans:B





*/