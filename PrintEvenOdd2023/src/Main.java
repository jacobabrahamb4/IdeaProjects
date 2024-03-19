public class Main {

    int MAX = 20;

    int count = 1;

    private Object lock = new Object();

    public void printEven() {
        synchronized (lock) {
            while (count < MAX) {
                if (count % 2 == 0) {
                    System.out.println("Even number: " + count);
                    count++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    public void printOdd() {
        synchronized (lock) {
            while (count < MAX) {
                if (count % 2 == 1) {
                    System.out.println("Odd number: " + count);
                    count++;
                    lock.notify();
                } else {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Main main = new Main();
        Thread oddThread = new Thread(new Runnable() {
            @Override
            public void run() {
                main.printOdd();
            }
        });

        Thread evenThread = new Thread(new Runnable() {
            @Override
            public void run() {
                main.printEven();
            }
        });

        oddThread.start();
        evenThread.start();

        try {
            oddThread.join();
            evenThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}