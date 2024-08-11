package task1.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class ProcessingThread implements Runnable {
    private static final AtomicInteger count = new AtomicInteger();
    private static final int MAX_COUNT =50;

    @Override
    public void run() {
        while (count.incrementAndGet() < MAX_COUNT) {
            count.incrementAndGet();
        }
    }

    public static AtomicInteger getCount () {
        return count;
    }

}