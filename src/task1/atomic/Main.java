package task1.atomic;

public class Main {
    private static final int NUM_THREADS = Runtime.getRuntime().availableProcessors();

    public static void main(String[] args) {
        for(int i=0; i < NUM_THREADS; i++) {
            ProcessingThread processingThread = new ProcessingThread();
            Thread thread = new Thread(processingThread);
            thread.start();
        }

        System.out.println(STR."Результат: \{ProcessingThread.getCount()}");
    }
}
