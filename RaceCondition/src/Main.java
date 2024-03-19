public class Main {

    public static void main(String[] args) {
        LongWrapper longWrapper = new LongWrapper(0L);

        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                longWrapper.incrementValue();
            }
        };
        Thread[] threads = new Thread[1000];

        for (int i = 0; i < threads.length; i++) {
            threads[i] = new Thread(runnable);
            threads[i].start();
        }

        for (int i = 0; i < threads.length; i++) {
            try {
                threads[i].join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Value: " + longWrapper.getValue());
    }
}