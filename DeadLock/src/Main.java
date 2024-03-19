public class Main {
    private static final Object resource1 = new Object();
    private static final Object resource2 = new Object();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 1 acquired resource 1");

                try {
                    Thread.sleep(1000); // Introduce some delay to make the deadlock more evident
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                synchronized (resource2) {
                    System.out.println("Thread 1 acquired resource 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (resource1) {
                System.out.println("Thread 2 acquired resource 1");

                synchronized (resource2) {
                    System.out.println("Thread 2 acquired resource 2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
