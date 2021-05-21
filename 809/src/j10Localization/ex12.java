package j10Localization;

import java.time.LocalTime;
import static java.time.temporal.ChronoUnit.*;

public class ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalTime now=LocalTime.now();
		long timeToBreakfast=0;

		LocalTime office_start=LocalTime.of(7,30);
		if(office_start.isAfter(now)){
			timeToBreakfast=now.until(office_start,MINUTES);
		}else{
			timeToBreakfast=now.until(office_start,HOURS);
		}

		System.out.println(timeToBreakfast);
		
		
	}

}
/*
Given the code fragment:

LocalTime now=LocalTime.now();
		long timeToBreakfast=0;

		LocalTime office_start=LocalTime.of(7,30);
		if(office_start.isAfter(now)){
			timeToBreakfast=now.until(office_start,MINUTES);
		}else{
			timeToBreakfast=now.until(office_start,HOURS);
		}

		System.out.println(timeToBreakfast);
		

Assume that the value of now is 6:30 in the morning.

What is the result?

A) 60
B) 0
C) 1
D) An exception is thrown at run time


ans:A

*/