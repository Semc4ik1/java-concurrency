package task1.synchronization;

public class ProcessingThread implements Runnable {
    private static int count = 0;


    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
            synchronized (ProcessingThread.class) {
                count++;
            }
        }
    }


    public static synchronized int getCount() {
        return count;
    }
}
