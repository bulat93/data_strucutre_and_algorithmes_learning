package multithreading;

public class ThreadRun {

    public static void main(String[] args) {
        Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
        Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");
        System.out.println("Starting Runnable threads");
        t1.start();
        t2.start();
        System.out.println("Runnable Threads has been started");
        Thread t3 = new Thread(new MyThread("t3"));
        Thread t4= new Thread(new MyThread("t4"));
        t3.start();
        t4.start();
        System.out.println("MyThreads has been started");
    }
}
