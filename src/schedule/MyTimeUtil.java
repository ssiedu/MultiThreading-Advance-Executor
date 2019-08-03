package schedule;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class MyTimeUtil {
        //function to get a new date after adding some millis to current date
        public static Date addMilis(Date initial, long millisToAdd){
            Calendar cal=GregorianCalendar.getInstance();
            cal.setTimeInMillis(initial.getTime()+millisToAdd);
            return cal.getTime();
        }
        public static Date addMonths(Date initial, int monthsToAdd){
            Calendar cal=GregorianCalendar.getInstance();
            cal.setTime(initial);
            cal.add(Calendar.MONTH, monthsToAdd);
            return cal.getTime();
        }
}
