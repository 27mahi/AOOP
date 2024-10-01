package numberprinter;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        NumberPrinter printer = new NumberPrinter();

        ExecutorService executor = Executors.newFixedThreadPool(5);

        executor.submit(new PrintTwo(printer));
        executor.submit(new PrintThree(printer));
        executor.submit(new PrintFour(printer));
        executor.submit(new PrintFive(printer));
        executor.submit(new PrintNumber(printer));

        executor.shutdown();
    }
}
