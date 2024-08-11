package task1.synchronization;

public class ProcessingThread implements Runnable {
    private static volatile int count = 0;
    private final int MAX_COUNT =50;

    @Override
    public void run() {
        while (true) {
            synchronized (ProcessingThread.class) {
                if (count >= MAX_COUNT) {
                    break;
                }
                count++;
            }
        }
    }
    public static synchronized int getCount() {
        return count;
    }
}
