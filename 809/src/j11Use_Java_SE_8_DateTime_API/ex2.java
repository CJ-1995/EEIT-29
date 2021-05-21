package j11Use_Java_SE_8_DateTime_API;

import java.util.Optional;

public class ex2 {

	public static void main(String[] args) {
		Address address = new Address();
		Optional<Address> addrs1 = Optional.ofNullable(address);
		Employee e1 = new Employee(addrs1);
		String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
		System.out.println(eAddress);
	
	}

}
class Employee {
	 
    Optional<Address> address;
 
    Employee(Optional<Address> address) {
        this.address = address;
    }
 
    public Optional<Address> getAddress() {
        return address;
    }
}
 
class Address {
 
    String city = "New York";
 
    public String getCity() {
        return city;
    }
 
    public String toString() {
        return city;
    }
}



/*
Given the code fragments:

class Employee {
 
    Optional<Address> address;
 
    Employee(Optional<Address> address) {
        this.address = address;
    }
 
    public Optional<Address> getAddress() {
        return address;
    }
}
 
class Address {
 
    String city = "New York";
 
    public String getCity() {
        return city;
    }
 
    public String toString() {
        return city;
    }
}


and

Address address = null;
Optional<Address> addrs1 = Optional.ofNullable(address);
Employee e1 = new Employee(addrs1);
String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
System.out.println(eAddress);

What is the result?

A.
New York

B.
City Not available

C.
null

D.
A NoSuchElementException is thrown at run time.



*/