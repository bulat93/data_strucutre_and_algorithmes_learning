package multithreading.ReadWriteExample;

import java.io.*;
import java.util.concurrent.BlockingQueue;

public class ReadThread implements Runnable{

    protected BlockingQueue<String> blockingQueue = null;

    public ReadThread(BlockingQueue<String> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {

        try (BufferedReader br = new BufferedReader(new FileReader(new File("C://Folder//1.txt")))) {
            String buffer;
            while ((buffer = br.readLine()) != null){
                blockingQueue.put(buffer);
            }

            blockingQueue.put("EOF");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
