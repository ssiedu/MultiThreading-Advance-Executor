//creating daemon using Executor framework

import static java.lang.System.out;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

//setting all even threads daemon
class MyNameThreadFactoryForDaemon implements ThreadFactory{
    public static int count=0;
    @Override
    public Thread newThread(Runnable r) {
        
        Thread t= new Thread(r,"MyThread : "+(++count));
        if(count%2==0){
            t.setDaemon(true);
        }
        return t;
    }
    
}
public class DaemonTwo {

    public static void main(String[] args) {
        out.println("Starting App");
        ExecutorService service=Executors.newCachedThreadPool(new MyNameThreadFactoryForDaemon());
        service.submit(new TaskThree(100));
        service.submit(new TaskThree(200));
        service.submit(new TaskThree(100));
        service.submit(new TaskThree(200));
        service.submit(new TaskThree(100));
        service.shutdown();
    }
}
