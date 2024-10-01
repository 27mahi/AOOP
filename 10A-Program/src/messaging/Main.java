package messaging;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Create a thread-safe BlockingQueue with a capacity of 5
        BlockingQueue<String> sharedBuffer = new LinkedBlockingQueue<>(5);

        // Creating a pool of 2 threads for producer and consumer
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Running the producer and consumer concurrently
        executor.submit(new Producer(sharedBuffer));
        executor.submit(new Consumer(sharedBuffer));

        // Shutdown executor service gracefully
        executor.shutdown();
    }
}
