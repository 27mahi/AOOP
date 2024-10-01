package numberprinter;

public class PrintFive implements Runnable {
    private final NumberPrinter printer;

    public PrintFive(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printFive();
    }
}
