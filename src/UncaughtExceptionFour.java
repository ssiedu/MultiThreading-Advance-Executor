//common handler for all threads in executor framework

import static java.lang.System.out;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

//separate handler for multiple threads
class HandlerOne implements Thread.UncaughtExceptionHandler {

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        out.println("Handled In Handler One For "+t.getName());
    }
    
}
class HandlerTwo implements Thread.UncaughtExceptionHandler {
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        out.println("Handled In Handler Two For "+t.getName());
    }
    
}

public class UncaughtExceptionFour {

    public static void main(String[] args) throws Exception {
        
        Thread.setDefaultUncaughtExceptionHandler(new ThreadExceptionHandler());    
        
        ErrorTask task1 = new ErrorTask();
        ErrorTask task2 = new ErrorTask();
        ErrorTask task3 = new ErrorTask();
        ErrorTask task4 = new ErrorTask();
        
        ExecutorService service1=Executors.newCachedThreadPool(new ThreadFactory(){
            @Override
            public Thread newThread(Runnable r) {
                Thread t=new Thread(r);
                t.setUncaughtExceptionHandler(new HandlerOne());
                return t;
            }
        });
        
        ExecutorService service2=Executors.newCachedThreadPool(new ThreadFactory(){
            @Override
            public Thread newThread(Runnable r) {
                Thread t=new Thread(r);
                t.setUncaughtExceptionHandler(new HandlerTwo());
                return t;
            }
        });
        
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
