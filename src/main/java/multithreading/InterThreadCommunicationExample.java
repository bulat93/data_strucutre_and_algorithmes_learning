package multithreading;

import java.util.LinkedList;
import java.util.Queue;

public class InterThreadCommunicationExample {

    public static void main(String[] args) {

        final Queue sharedQ = new LinkedList();

        Thread producer = new Producer(sharedQ);
        Thread consumer = new Consumer(sharedQ);

        producer.start();
        consumer.start();
    }


    static class Producer extends Thread {
        private final Queue sharedQ;

        Producer(Queue sharedQ) {
            super("Producer");
            this.sharedQ = sharedQ;
        }

        @Override
        public void run() {
            for (int i = 0; i < 4; i++) {

                synchronized (sharedQ) {
                    while (sharedQ.size() >= 1) {
                        try {
                            System.out.println("Queue is full, waiting");
                            sharedQ.wait();
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                    System.out.println("producing : " + i);
                    sharedQ.add(i);
                    sharedQ.notify();
                }
            }
        }
    }

    static class Consumer extends Thread {
        private final Queue sharedQ;

        Consumer(Queue sharedQ) {
            super("Consumer");
            this.sharedQ = sharedQ;
        }

        @Override
        public void run() {
            while(true) {

                synchronized (sharedQ) {
                    while (sharedQ.size() == 0) {
                        try {
                            System.out.println("Queue is empty, waiting");
                            sharedQ.wait();
                        } catch (InterruptedException ex) {
                            ex.printStackTrace();
                        }
                    }
                    int number = (int) sharedQ.poll();
                    System.out.println("consuming : " + number );
                    sharedQ.notify();

                    if(number == 3){break; }
                }
            }
        }

    }
}
