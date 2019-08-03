
import static java.lang.System.out;

public class ThreadExceptionHandler implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        out.println("Exception Handled For "+t.getName()+","+e.getClass().getName());
    }
    
}
