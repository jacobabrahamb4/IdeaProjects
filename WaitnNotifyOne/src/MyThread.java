public class MyThread extends Thread {
    String s;
    Object syncToken;

    public MyThread(Object syncToken) {
        this.s = "";
        this.syncToken = syncToken;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (syncToken) {
                try {
                    syncToken.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("MyThread : " + s);
        }
    }

    public void setText(String s) {
        this.s = s;
    }


}
