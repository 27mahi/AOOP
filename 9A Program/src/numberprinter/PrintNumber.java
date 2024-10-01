package numberprinter;

public class PrintNumber implements Runnable {
    private final NumberPrinter printer;

    public PrintNumber(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printNumber();
    }
}
