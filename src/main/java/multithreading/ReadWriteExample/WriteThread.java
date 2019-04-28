package multithreading.ReadWriteExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.concurrent.BlockingQueue;

public class WriteThread implements Runnable{

    protected BlockingQueue<String> blockingQueue = null;

    public WriteThread(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        try (PrintWriter printWriter = new PrintWriter(new File("C://Folder//2.txt"))) {

            while (true) {
                String buffer = blockingQueue.take();

                if (buffer.equals("EOF")) {
                    break;
                }

                printWriter.println(buffer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
