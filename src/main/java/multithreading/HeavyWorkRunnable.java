package multithreading;

public class HeavyWorkRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Doing heavy processing - Start " + Thread.currentThread().getName());

        try {
            Thread.sleep(1000);

            doDBProcesing();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Doing heavy processing - END " + Thread.currentThread().getName());
    }

    private void doDBProcesing() throws InterruptedException {
        Thread.sleep(5000);
    }
}
