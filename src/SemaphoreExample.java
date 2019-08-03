//using semaphore we are restricting only three threads to run 

import static java.lang.System.out;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

class SemaphoreTask implements Runnable {
    
    private Semaphore semaphore;
    public SemaphoreTask(Semaphore semaphore){
        this.semaphore=semaphore;
    }
    public void run(){
        try{
        String name=Thread.currentThread().getName();
        semaphore.acquire();
        out.println(name+" is acquiring permit : ");
        for(int i=1;i<=5;i++){
            out.println(name+"==>"+i);
            Thread.sleep(5000);
        }
        out.println(name+" is releasing permit : ");
        semaphore.release();
        }catch(Exception e){}
    }
    
}

public class SemaphoreExample {
    public static void main(String arggs[]) throws Exception {
        
        Semaphore semaphore=new Semaphore(3);
        ExecutorService service=Executors.newFixedThreadPool(10);
        for(int i=1; i<=50; i++){
           service.submit(new SemaphoreTask(semaphore));
        }
        service.shutdown();
    }
}
