//https://www.youtube.com/watch?v=V4yz88hN7KY&list=PL03wCzbCnPVUNAbskAY8HK7b6hjhNWaS3&index=14
//https://courses.caveofprogramming.com/courses/java-multithreading/lectures/40171//
import static java.lang.System.out;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;



public class ExecutorOne {

    public static void main(String[] args) throws Exception {
        System.out.println("Starting App");
        ExecutorService service=Executors.newCachedThreadPool();
        service.submit(new TaskOne());
        service.submit(new TaskOne());
        service.submit(new TaskOne());
        service.submit(new TaskOne());
        Thread.sleep(5000);
        System.out.println("Now Submitting More Task : ");
        service.submit(new TaskOne());
        service.submit(new TaskOne());
        service.shutdown();
        
    }
}
