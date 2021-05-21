package j11Use_Java_SE_8_DateTime_API;

import java.time.LocalDate;
import java.time.Month;

public class ex5 {

	public static void main(String[] args) {
		LocalDate valentinesDay = LocalDate.of(2015, Month.FEBRUARY, 14);
		
		LocalDate nextYear = valentinesDay.plusYears(1);
		nextYear.plusDays(15); //line n1
		System.out.println(nextYear);
		

	}

}
/*
Given the code fragment:

LocalDate valentinesDay = LocalDate.of(2015, Month.FEBRUARY, 14);
LocalDate nextYear = valentinesDay.plusYears(1);
nextYear.plusDays(15); //line n1
System.out.println(nextYear);

What is the result?

A.

2016-02-14

B. A DateTimeException is thrown.

C.

2016-02-29

D. A compilation error occurs at line n1.


*/