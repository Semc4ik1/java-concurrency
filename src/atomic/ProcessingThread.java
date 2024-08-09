package atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class ProcessingThread implements Runnable {
    private static final int NUM_THREADS = Runtime.getRuntime().availableProcessors();
    private final AtomicInteger count = new AtomicInteger();


    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
            processSomething(i);
            count.incrementAndGet();
        }
    }


    private void processSomething(int i) {
        System.out.println(STR."\{Thread.currentThread().getName()} Начал операцию \{i}");
        System.out.println(STR."\{Thread.currentThread().getName()} Завершил операцию \{i}");
    }
    public void startThreads() {
        for(int i=0; i < NUM_THREADS; i++) {
            ProcessingThread processingThread = new ProcessingThread();
            Thread thread = new Thread(processingThread);
            thread.start();
        }
    }
}