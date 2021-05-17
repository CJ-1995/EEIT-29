package homeWork;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.sun.xml.internal.bind.v2.runtime.RuntimeUtil.ToStringAdapter;

public class TastTime {
	public static void main(String[] args) {
		Date now = new Date();
		Calendar calendar = new  GregorianCalendar(); 
	    calendar.setTime(now);
	    calendar.add(calendar.DATE,1);
		System.out.println(now.toString());
	}
}
/*
Date date=new   Date();//取時間
System.out.println(date.toString());
    Calendar   calendar   =   new   GregorianCalendar(); 
    calendar.setTime(date); 
    calendar.add(calendar.YEAR, 1);//把日期往後增加一年.整數往後推,負數往前移動
    calendar.add(calendar.DAY_OF_MONTH, 1);//把日期往後增加一個月.整數往後推,負數往前移動
    calendar.add(calendar.DATE,1);//把日期往後增加一天.整數往後推,負數往前移動 
    calendar.add(calendar.WEEK_OF_MONTH, 1);//把日期往後增加一個月.整數往後推,負數往前移動
    date=calendar.getTime();   //這個時間就是日期往後推一天的結果 
    System.out.println(date.toString());
*/