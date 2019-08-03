
import static java.lang.System.out;

public class IsAliveCheckOne {
     public static void main(String[] args) throws Exception {
        out.println("Starting App");
        Thread t1=new Thread(new TaskThree(50), "First");
        Thread t2=new Thread(new TaskThree(100), "Second");
        out.println("First Before Start : "+t1.isAlive());
        out.println("Second Before Start : "+t2.isAlive());
        t1.start();
        t2.start();
        while(true){
            Thread.sleep(50);
            boolean firstLiveStatus=t1.isAlive();
            boolean secondLiveStatus=t2.isAlive();
            out.println("First Status  : "+firstLiveStatus);
            out.println("Second Status : "+secondLiveStatus);
            if(!firstLiveStatus && !secondLiveStatus){
                break;
            }
        }
        out.println("Ending App");
    }
}
