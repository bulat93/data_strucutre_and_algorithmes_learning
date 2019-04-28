package multithreading;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

public class ProducerConsumerPattern {

    public static void main(String[] args) {
        BlockingQueue blockingQueue = new LinkedBlockingDeque();

        Thread producerThread = new Thread(new Producer(blockingQueue));
        Thread consumerThread = new Thread(new Consumer(blockingQueue));

        producerThread.start();
        consumerThread.start();
    }

    static class Producer implements Runnable{

        private final BlockingQueue sharedQueue;

        Producer(BlockingQueue sharedQueue) {
            this.sharedQueue = sharedQueue;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++){
                System.out.println("Produced: " + i);
                try {
                    sharedQueue.put(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    static class Consumer implements Runnable{

        private final BlockingQueue sharedQueue;

        Consumer(BlockingQueue sharedQueue) {
            this.sharedQueue = sharedQueue;
        }

        @Override
        public void run() {
           while (true){
               try {
                   System.out.println("Consumed: "+ sharedQueue.take());
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
           }
        }
    }
}
