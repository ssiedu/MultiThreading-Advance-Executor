
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TaskFive implements Runnable {

    private boolean shutdown;

    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 2; i++) {
            out.println("Thread " + name + " " + " => " + i +" Interrupted Status : "+Thread.interrupted());
        }
        out.println("Thread " + name + " : Interrupted Status =>"+  Thread.interrupted());
    }

}
