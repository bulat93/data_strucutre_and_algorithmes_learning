package multithreading.ReadWriteExample;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class StartRead {

    public static void main(String[] args) {
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(102412313);

        ReadThread reader = new ReadThread(queue);
        WriteThread writer = new WriteThread(queue);

        new Thread(reader).start();
        new Thread(writer).start();
    }
}
