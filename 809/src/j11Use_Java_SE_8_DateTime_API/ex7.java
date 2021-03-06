package j11Use_Java_SE_8_DateTime_API;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;

public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZoneId zone=ZoneId.of("America/New_York");
		ZonedDateTime dt=ZonedDateTime.of(LocalDate.of(2015, 3, 8), LocalTime.of(1,0),
		zone);
		ZonedDateTime dt2=dt.plusHours(1);
		System.out.print(DateTimeFormatter.ofPattern("H:mm-").format(dt2));
		System.out.println("difference: "+ChronoUnit.HOURS.between(dt, dt2));
		

	}

}
/*
In 2015, daylight saving time in New York, USA, begins on March 8th at 2:00 Am. As a result, 2:00 AM
becomes 3:00 AM.

Given the code fragment:

		ZoneId zone=ZoneId.of("America/New_York");
		ZonedDateTime dt=ZonedDateTime.of(LocalDate.of(2015, 3, 8), LocalTime.of(1,0),
		zone);
		ZonedDateTime dt2=dt.plusHours(2);
		System.out.print(DateTimeFormatter.ofPattern("H:mm-").format(dt2));
		System.out.println("difference: "+ChronoUnit.HOURS.between(dt, dt2));

What is the result?

A) 3:00-difference: 2

B) 2:00-difference: 1

c) 4:00-difference: 2

d) 4:00-difference: 3


ans:C

*/