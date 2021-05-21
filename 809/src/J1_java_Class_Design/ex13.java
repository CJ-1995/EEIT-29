package J1_java_Class_Design;

public class ex13 {
	
	

}
/*
Given the code fragment:
String[] colors = {"red", "blue", "green", "yellow", "maroon", "cyan"};
Which code fragment prints blue, cyan, ?

A.
for (String c : colors) {
    if (c.length() != 4) {
        continue;
    }
    System.out.print(c + ", ");
}

B.
for (String c : colors[]) {
    if (c.length() <= 4) {
        continue;
    }
    System.out.print(c + ", ");
}

C.
for (String c : String[] colors) {
    if (c.length() >= 4) {
        continue;
    }
    System.out.print(c + ", ");
}

D.
for (String c : colors) {
    if (c.length() >= 4) {
        System.out.print(c + ", ");
        continue;
    }
}


*/