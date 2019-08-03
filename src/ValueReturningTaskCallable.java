
import static java.lang.System.out;
import java.util.concurrent.Callable;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ValueReturningTaskCallable implements Callable<Integer>{
    private long sleepTime;
    private int sum;
    private int a, b;
    
    public ValueReturningTaskCallable(int a, int b, long sleepTime){
        this.a=a; this.b=b; this.sleepTime=sleepTime;
    }
    public Integer call(){
        String name=Thread.currentThread().getName();
        out.println("Computing Sum For  : "+name);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(ValueReturningTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        sum=a+b;
        out.println("Sum Computation If Over For : "+name);
        return sum;
    }
    
}
