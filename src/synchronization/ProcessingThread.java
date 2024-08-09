package synchronization;

public class ProcessingThread implements Runnable {
    private static final int NUM_THREADS = Runtime.getRuntime().availableProcessors();
    private int count = 0;

    public ProcessingThread() {
    }


    @Override
    public void run() {
        for (int i = 1; i < 50; i++) {
            processSomething(i);
            count++;
        }
    }

    private synchronized void processSomething(int i) {

        System.out.println(STR."\{Thread.currentThread().getName()} Начал итерацию \{i}");
        System.out.println(STR."\{Thread.currentThread().getName()} Завершил итерацию \{i}");

    }

    public void startThreads() {
        for(int i=0; i < NUM_THREADS; i++) {
            ProcessingThread processingThread = new ProcessingThread();
            Thread thread = new Thread(processingThread);
            thread.start();
        }
    }

}
