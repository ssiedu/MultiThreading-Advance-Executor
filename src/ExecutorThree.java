
import static java.lang.System.out;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorThree {
 public static void main(String[] args) {
        System.out.println("Starting App");
        ExecutorService service=Executors.newFixedThreadPool(2);
        service.submit(new TaskOne());
        service.submit(new TaskOne());
        service.submit(new TaskOne());
        service.submit(new TaskOne());
        service.submit(new TaskOne());
        service.submit(new TaskOne());
        service.shutdown();
        
        
    }    
}
