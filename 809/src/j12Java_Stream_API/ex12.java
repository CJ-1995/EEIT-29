package j12Java_Stream_API;



public class ex12 {

	public static void main(String[] args) {
		

	}

}
class Emp2 {
	 
    String fName;
    String lName;
 
    public Emp2(String fn, String ln) {
        fName = fn;
        lName = ln;
    }
 
    public String getfName() {
        return fName;
    }
 
    public String getlName() {
        return lName;
    }
}

/*
Given:
public class Emp {
 
    String fName;
    String lName;
 
    public Emp(String fn, String ln) {
        fName = fn;
        lName = ln;
    }
 
    public String getfName() {
        return fName;
    }
 
    public String getlName() {
        return lName;
    }
}
and the code fragment:

List<Emp> emp = Arrays.asList(
        new Emp("John", "Smith"),
        new Emp("Peter", "Sam"),
        new Emp("Thomas", "Wale"));
emp.stream()
        //line n1
        .collect(Collectors.toList());
Which code fragment, when inserted at line n1, sorts the employees list in descending order of fName and then ascending order of lName?

A.
sorted(Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName))

B.
.sorted(Comparator.comparing(Emp::getfName).thenComparing(Emp::getlName))

C.
.map(Emp::getfName).sorted(Comparator.reverseOrder())

D.
.map(Emp::getfName).sorted(Comparator.reserveOrder().map(Emp::getlName).reserved




*/