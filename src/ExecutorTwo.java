
import static java.lang.System.out;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;


//giving customized names to the thread created by Executor

class MyNameThreadFactory implements ThreadFactory{
    public static int count=1;
    @Override
    public Thread newThread(Runnable r) {
        return new Thread(r,"MyThread : "+count++);
    }
    
}


public class ExecutorTwo{

    public static void main(String[] args) {
        System.out.println("Starting App");
        //ExecutorService service=Executors.newCachedThreadPool();
        ExecutorService service=Executors.newCachedThreadPool(new MyNameThreadFactory());
        service.submit(new TaskOne());
        service.submit(new TaskOne());
        service.submit(new TaskOne());
        
    }
}
