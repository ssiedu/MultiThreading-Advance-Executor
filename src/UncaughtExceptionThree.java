//common handler for all threads in executor framework

import static java.lang.System.out;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//same as legacy threading

public class UncaughtExceptionThree {

    public static void main(String[] args) throws Exception {
        
        Thread.setDefaultUncaughtExceptionHandler(new ThreadExceptionHandler());    
        
        ErrorTask task1 = new ErrorTask();
        ErrorTask task2 = new ErrorTask();
        ErrorTask task3 = new ErrorTask();
        ErrorTask task4 = new ErrorTask();
        
        ExecutorService service1=Executors.newCachedThreadPool();
        ExecutorService service2=Executors.newCachedThreadPool();
        
        service1.execute(task1);
        service1.execute(task2);
        service2.execute(task3);
        service2.execute(task4);
        
        service1.shutdown();
        service2.shutdown();
        
        Thread.sleep(5000);
        out.println("Ending App");
        
    }
}
