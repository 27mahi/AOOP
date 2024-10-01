package boundedbuffer;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        // Create a bounded buffer with a maximum capacity of 10 items
        BlockingQueue<Integer> sharedBuffer = new LinkedBlockingQueue<>(10);

        // Create a pool of threads for producer and consumer
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Submit producer and consumer tasks
        executor.submit(new Producer(sharedBuffer));
        executor.submit(new Consumer(sharedBuffer));

        // Gracefully shutdown the executor (not immediate, tasks complete first)
        executor.shutdown();
    }
}
