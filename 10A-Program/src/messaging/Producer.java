package messaging;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private final BlockingQueue<String> buffer;

    public Producer(BlockingQueue<String> buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int messageNumber = 1;
        while (true) {
            try {
                String message = "Message " + messageNumber++;
                buffer.put(message);  // Add message to the buffer (blocking if full)
                System.out.println("Produced: " + message);
                Thread.sleep(500);  // Simulate time taken to produce a message
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
