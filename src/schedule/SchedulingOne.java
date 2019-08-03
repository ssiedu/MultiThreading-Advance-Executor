package schedule;

import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class SchedulingOne {
    static SimpleDateFormat formatter=new SimpleDateFormat("dd-MMM-yyy HH:mm:ss.SSS"); 
    public static void main(String[] args) throws Exception {
        
        out.println("Starting Scheduling One @ "+formatter.format(new Date()));
        Timer timer=new Timer("Task-One",true);
        timer.schedule(new ScheduleTaskOne(), 5000);//schedule after (delay)
        timer.schedule(new ScheduleTaskOne(),10000);
        Thread.sleep(20000);
        out.println("Ending Scheduling One");
    }
}
