package numberprinter;

public class PrintTwo implements Runnable {
    private final NumberPrinter printer;

    public PrintTwo(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printTwo();
    }
}
