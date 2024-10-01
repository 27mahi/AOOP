package numberprinter;

public class NumberPrinter {
    private int current = 1;
    private final int MAX = 15;

    public synchronized void printTwo() {
        while (current <= MAX) {
            if (current % 2 == 0 && current % 3 != 0 && current % 4 != 0 && current % 5 != 0) {
                System.out.println("Divisible by 2: " + current);
                current++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public synchronized void printThree() {
        while (current <= MAX) {
            if (current % 3 == 0 && current % 4 != 0 && current % 5 != 0) {
                System.out.println("Divisible by 3: " + current);
                current++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public synchronized void printFour() {
        while (current <= MAX) {
            if (current % 4 == 0 && current % 5 != 0) {
                System.out.println("Divisible by 4: " + current);
                current++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public synchronized void printFive() {
        while (current <= MAX) {
            if (current % 5 == 0) {
                System.out.println("Divisible by 5: " + current);
                current++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public synchronized void printNumber() {
        while (current <= MAX) {
            if (current % 2 != 0 && current % 3 != 0 && current % 4 != 0 && current % 5 != 0) {
                System.out.println("Number: " + current);
                current++;
                notifyAll();
            } else {
                try {
                    wait();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
