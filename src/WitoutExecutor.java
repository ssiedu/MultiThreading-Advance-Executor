
import static java.lang.System.out;



public class WitoutExecutor {

    public static void main(String[] args) {
        System.out.println("Starting App");
        Thread t1=new Thread(new TaskOne());
        Thread t2=new Thread(new TaskTwo());
        t1.start();
        t2.start();
    }
}
