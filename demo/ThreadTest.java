package demo;

public class ThreadTest {

    // The 'volatile' keyword ensures that changes to this variable
    // are immediately visible to other threads.
    // This variable acts as a flag to control the execution of the thread.
    private volatile boolean running = true;

    public void startThread() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // The thread keeps running as long as 'running' is true.
                // Due to 'volatile', the latest value of 'running' is read from main memory.
                while (running) {
                    System.out.println("Thread is running...");
                    try {
                        // Simulating some work with sleep
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Thread was interrupted");
                    }
                }
                System.out.println("Thread stopped.");
            }
        });

        thread1.start();
    }

    public void stopThread() {
        // Updating the 'running' variable, which will be visible to thread1
        // because the variable is marked as 'volatile'.
        running = false;
    }

    public static void main(String[] args) throws InterruptedException {
    	ThreadTest example = new ThreadTest();
        
        // Start the thread
        example.startThread();

        // Main thread sleeps for 5 seconds, representing some processing time
        Thread.sleep(5000);

        // Stop the thread by changing the state of 'running'
        example.stopThread();
    }
}