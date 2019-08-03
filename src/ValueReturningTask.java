
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ValueReturningTask implements Runnable{
    private long sleepTime;
    private int sum;
    private int a, b;
    
    public ValueReturningTask(int a, int b, long sleepTime){
        this.a=a; this.b=b; this.sleepTime=sleepTime;
    }
    public void run(){
        String name=Thread.currentThread().getName();
        out.println("Computing Sum For  : "+name);
        try {
            Thread.sleep(sleepTime);
        } catch (InterruptedException ex) {
            Logger.getLogger(ValueReturningTask.class.getName()).log(Level.SEVERE, null, ex);
        }
        sum=a+b;
        out.println("Sum Computation If Over For : "+name);
 
    }
    public int getSum(){
        return sum;
    }
}
