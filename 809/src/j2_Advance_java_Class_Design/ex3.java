package j2_Advance_java_Class_Design;

public class ex3 {

}
class Canvas implements Drawable {
	 
    public void draw() {
    }
}

 abstract class Board extends Canvas {
}

 class Paper extends Canvas {
 
    protected void draw(int color) {
    }
}

 class Frame extends Canvas implements Drawable {
 
    public void resize() {
    }
}

 interface Drawable {
 
    public abstract void draw();
}
/*
Given:
public class Canvas implements Drawable {
 
    public void draw() {
    }
}

public abstract class Board extends Canvas {
}

public class Paper extends Canvas {
 
    protected void draw(int color) {
    }
}

public class Frame extends Canvas implements Drawable {
 
    public void resize() {
    }
}

public interface Drawable {
 
    public abstract void draw();
}

Which statement is true?

A. Board does not compile.
B. Paper does not compile.
C. Frame does not compile.
D. Drawable does not compile.
E. All classes compile successfully.


*/