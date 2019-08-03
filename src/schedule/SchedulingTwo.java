package schedule;

import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

public class SchedulingTwo {
    static SimpleDateFormat formatter=new SimpleDateFormat("dd-MMM-yyy HH:mm:ss.SSS"); 

    public static void main(String[] args) throws Exception {
        Date current=new Date();
        String start=formatter.format(current);
        //Date futureDate=MyTimeUtil.addMilis(current,15000);//Date after 15000 milliseconds
        Date futureDate=MyTimeUtil.addMonths(current, 3);//Date after 3 monthds
        String schedule=formatter.format(futureDate);
        out.println("Starting Scheduling One @ "+start);
        out.println("Scheduling @ "+schedule);
        Timer timer=new Timer("Timer-One",true);
        timer.schedule(new ScheduleTaskOne(),futureDate);//schedule after (delay)
        Thread.sleep(10000);
        out.println("Ending Scheduling One");
    }
}
