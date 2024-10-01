package messaging;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private final BlockingQueue<String> buffer;

    public Consumer(BlockingQueue<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String message = buffer.take();  // Take message from the buffer (blocking if empty)
                System.out.println("Consumed: " + message);
                Thread.sleep(1000);  // Simulate time taken to process the message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
