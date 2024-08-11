package task1.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class ProcessingThread implements Runnable {
    private static final AtomicInteger COUNT = new AtomicInteger();

    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
            COUNT.incrementAndGet();
        }
    }

    public static int getCount() {
        return COUNT.get();
    }

}
