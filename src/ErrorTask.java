
import static java.lang.System.out;

public class ErrorTask implements Runnable {
    public void run(){
        String name=Thread.currentThread().getName();
        out.println("Started "+name);
        out.println(10/0);
        out.println("Stopping "+name);
    }
            
    
}
