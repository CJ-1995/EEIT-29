package j11Use_Java_SE_8_DateTime_API;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class ex8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// Login time:2015-01-12T21:58:18.817z
		Instant loginTime=Instant.now();
		System.out.println(loginTime);
		Thread.sleep(1000);

		// Logout time:2015-01-12T21:58:19.880Z
		Instant logoutTime=Instant.now();
		System.out.println(logoutTime);
		loginTime=loginTime.truncatedTo(ChronoUnit.MINUTES); //line n1
		logoutTime=logoutTime.truncatedTo(ChronoUnit.MINUTES);

		if (logoutTime.isAfter(loginTime))
			System.out.println("Logged out at: "+logoutTime);
		else
			System.out.println("Can't logout");
		

	}

}
/*
Given the code fragment:

// Login time:2015-01-12T21:58:18.817z
Instant loginTime=Instant.now();
Thread.sleep(1000);

// Logout time:2015-01-12T21:58:19.880Z
Instant logoutTime=Instant.now();

loginTime=loginTime.truncatedTo(ChronoUnit.MINUTES); //line n1
logoutTime=logoutTime.truncatedTo(ChronUnit.MINUTES);

if (logoutTime.isAfter(loginTime))
	System.out.println("Logged out at: "+logoutTime);
else
	System.out.println("Can't logout");
	
	
What is the result?

A) Logged out at: 2015-01-12T21:58:00Z

B) Logged out at: 2015-01-12T21:58:19.880Z

C) Can't logout

D) A compilation error occurs at line n1

ans:C



*/