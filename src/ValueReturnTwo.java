
import static java.lang.System.out;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

//returning value using executor framework

public class ValueReturnTwo {
public static void main(String[] args) throws Exception {

        ValueReturningTaskCallable task1=new ValueReturningTaskCallable(10, 20, 2000);
        ValueReturningTaskCallable task2=new ValueReturningTaskCallable(30, 40, 12000);
        ValueReturningTaskCallable task3=new ValueReturningTaskCallable(50, 60, 2000);
        
        ExecutorService service=Executors.newFixedThreadPool(3);
        Future<Integer> future1=service.submit(task1);
        Future<Integer> future2=service.submit(task2);
        Future<Integer> future3=service.submit(task3);
        
        int r1=future1.get();
        out.println(r1);
        int r2=future2.get();
        out.println(r2);
        int r3=future3.get();
        out.println(r3);
        
        service.shutdown();
    }    
}
