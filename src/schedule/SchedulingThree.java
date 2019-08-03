package schedule;

import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class SchedulingThree {
    static SimpleDateFormat formatter=new SimpleDateFormat("dd-MMM-yyy HH:mm:ss.SSS"); 
    public static void main(String[] args) throws Exception {
        
        out.println("Starting Scheduling One @ "+formatter.format(new Date()));
        Timer timer=new Timer("Task-One",true);
        timer.schedule(new ScheduleTaskOne(), 10000, 5000);//schedule start after 10000 and will repeat after each 5000)
        Thread.sleep(50000);
        out.println("Now Cancelling Timer");
        timer.cancel();
        out.println("Ending Scheduling One");
    }
}
