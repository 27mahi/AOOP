package numberprinter;

public class PrintFour implements Runnable {
    private final NumberPrinter printer;

    public PrintFour(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printFour();
    }
}
