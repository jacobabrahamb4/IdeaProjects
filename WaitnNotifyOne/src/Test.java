public class Test {
    public static void main(String[] args) {
        Object syncToken = new Object();
        MyThread t = new MyThread(syncToken);
        t.start();
        for(int i = 0; i < 10; i++) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (syncToken) {
                t.setText("Iteration : " + i);
                syncToken.notify();
            }
        }
    }



}
