
import static java.lang.System.out;

class Booking {
    private int seats=5;
    
    public synchronized void book(int seat){
        if(seat<seats){
            out.println("Booing Success for seat : "+seat);
            seats=seats-seat;
            out.println("Remaining Seats : "+seats);
        }else{
            out.println("Cant Book "+seat+" seats ");
            out.println("Only "+seats+" seats available");
        }
    }
}

public class SyncDemo {
    public static void main(String args[]) throws Exception {
        out.println("Booking App Started");
        Booking booking  = new Booking();
        Thread t1=new Thread(new Runnable(){
            public void run(){
                booking.book(4);
            }
        });
        Thread t2=new Thread(new Runnable(){
            public void run(){
                booking.book(3);
            }
        });
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        out.println("Booking App Completed");
    }
}
