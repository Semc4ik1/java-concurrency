package task1.atomic;

public class Main {
    private static final int NUM_THREADS = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) throws InterruptedException {
        Thread[] threads = new Thread[NUM_THREADS];

        for (int i = 0; i < NUM_THREADS; i++) {
            ProcessingThread processingThread = new ProcessingThread();
            threads[i] = new Thread(processingThread);
            threads[i].start();
        }
        for (int i = 0; i < NUM_THREADS; i++) {
            threads[i].join();
        }

        System.out.println(STR."Результат: \{ProcessingThread.getCount()}");
    }
}
