package schedule;

import static java.lang.System.out;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimerTask;

public class ScheduleTaskOne extends TimerTask{

    SimpleDateFormat formatter=new SimpleDateFormat("dd-MMM-yyy HH:mm:ss.SSS");
    
    @Override
    public void run() {
        Date now=new Date();
        String name=Thread.currentThread().getName();
        out.println("Starting Job For "+name+" @ "+formatter.format(now));
    }
    
}
