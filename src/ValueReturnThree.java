//returning the value in the order of task completion rather than submiting order

import static java.lang.System.out;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class ValueReturnThree {
public static void main(String[] args) throws Exception {

        ValueReturningTaskCallable task1=new ValueReturningTaskCallable(10, 20, 2000);
        ValueReturningTaskCallable task2=new ValueReturningTaskCallable(30, 40, 12000);
        ValueReturningTaskCallable task3=new ValueReturningTaskCallable(50, 60, 2000);
        
        ExecutorService service=Executors.newFixedThreadPool(3);
        CompletionService<Integer> completionService=new ExecutorCompletionService<Integer>(service);
        
        completionService.submit(task1);
        completionService.submit(task2);
        completionService.submit(task3);
        
        service.shutdown();
        
        for(int i=0; i<3; i++){
            Future<Integer> future=completionService.take();
            int result=future.get();
            out.println(result);
        }
    }        
}
