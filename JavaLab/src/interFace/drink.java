package interFace;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.io.Serializable;

public class drink extends Product implements Expirable {

		private Date nowDate;

		public drink (String name, int price, Date nowDate) {
		        super(name, price);
		        this. nowDate = nowDate;
		    }
		
	
	 @Override
	   public String desc() {
	        String description = super.desc();
			description = description +",到期日："+nowDate;
	        return description;
	    }
	@Override
	public Date 最後期限() {
		Date nowDate = new Date();
		Calendar calendar = new  GregorianCalendar(); 
	    calendar.setTime(nowDate);
	    calendar.add(calendar.DATE,1);
		
		return nowDate;
	}

}
