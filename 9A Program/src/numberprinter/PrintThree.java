package numberprinter;

public class PrintThree implements Runnable {
    private final NumberPrinter printer;

    public PrintThree(NumberPrinter printer) {
        this.printer = printer;
    }

    @Override
    public void run() {
        printer.printThree();
    }
}
