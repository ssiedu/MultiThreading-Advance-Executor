//exclusing handler for each

import static java.lang.System.out;

public class UncaughtExceptionTwo {

    public static void main(String[] args) throws Exception {
        //Thread.setDefaultUncaughtExceptionHandler(new ThreadExceptionHandler());
        ErrorTask task1 = new ErrorTask();
        ErrorTask task2 = new ErrorTask();
        ErrorTask task3 = new ErrorTask();
        Thread t1 = new Thread(task1, "First");
        Thread t2 = new Thread(task2, "Second");
        Thread t3 = new Thread(task3, "Third");

        t1.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                out.println("Handler For First");
            }
        });

        t2.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                out.println("Handler For Second");
            }
        });
        
        
        t3.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                out.println("Handler For Third");
            }
        } );
        
        t1.start();
        t2.start();
        t3.start();
        t1.join();
        t2.join();
        t3.join();
        out.println("Ending App");

    }
}
