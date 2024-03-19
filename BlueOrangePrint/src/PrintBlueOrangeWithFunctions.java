import java.util.concurrent.atomic.AtomicBoolean;

public class PrintBlueOrangeWithFunctions {

    static Object lock = new Object();
    static boolean flag = false;
    static AtomicBoolean atomicBoolean = new AtomicBoolean();

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                printBlue();
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                printOrange();
            }
        }).start();
    }

    public static void printOrange() {
        while (true) {
            if (atomicBoolean.get() == false) {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                atomicBoolean.set(true);
            }
            System.out.println("Orange");
            synchronized (lock) {
                lock.notify();
            }
        }
    }

    public static void printBlue() {
        while (true) {
            if (atomicBoolean.get() == true) {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                atomicBoolean.set(false);
            }
            System.out.println("Blue");
            synchronized (lock) {
                lock.notify();
            }
        }
    }



}
