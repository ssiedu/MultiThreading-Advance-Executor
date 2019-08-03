
public class TerminateTwo {
    public static void main(String[] args) {
        TaskFive task1=new TaskFive();
        TaskFive task2=new TaskFive();
        TaskFive task3=new TaskFive();
        
        Thread t1=new Thread(task1,"First");
        Thread t2=new Thread(task2,"Second");
        Thread t3=new Thread(task3,"Third");
        t1.start();
        t2.start();
        t3.start();
        t1.interrupt();
        t2.interrupt();
        t3.interrupt();
        
    }
}
