public class threadscreation extends Thread {

    
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child thread");
        }
    }

    public static void main(String[] args) {
        // Create an instance of our thread class
        threadscreation t = new threadscreation();

        // Start the child thread (this calls the run() method asynchronously)
        t.start();

        // This is the job of the main thread
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread");
        }
    }
}
