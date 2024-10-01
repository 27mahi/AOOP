package boundedbuffer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<Integer> buffer;

    public Consumer(BlockingQueue<Integer> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                int item = buffer.take();  // Remove item from buffer, waits if empty
                System.out.println("Consumed: " + item);
                Thread.sleep(1000);  // Simulate time taken to process the item
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
