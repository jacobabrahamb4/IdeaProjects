
class PrintOrangeThread extends Thread {

    Lock lock;

    public PrintOrangeThread(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        while(true) {
            if(lock.flag == false) {
                synchronized (lock) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("Orange");
            lock.flag = false;
            synchronized (lock) {
                lock.notify();
            }
        }
    }
}

class PrintBlueThread extends Thread {

    Lock lock;

    public PrintBlueThread(Lock lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        super.run();
        while(true) {
            if (lock.flag == true) {
                try {
                    synchronized (lock) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Blue");
            lock.flag = true;
            synchronized (lock) {
                lock.notify();
            }
        }
    }
}

class Lock {
    static boolean flag = false;
}

public class Demo {

    public static void main(String[] args) {
        Lock lock = new Lock();
        PrintBlueThread printBlueThread = new PrintBlueThread(lock);
        PrintOrangeThread printOrangeThread = new PrintOrangeThread(lock);
        printBlueThread.start();
        printOrangeThread.start();
    }

}
