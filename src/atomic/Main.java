package atomic;

public class Main {
    public static void main(String[] args) {
        ProcessingThread processingThreadInstance = new ProcessingThread();
        processingThreadInstance.startThreads();
    }
}
