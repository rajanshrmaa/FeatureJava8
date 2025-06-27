package MultiThreading;

public class ThreadCreationUsingThread {

    public static void performAction(Action action, String message) {
        action.execute(message);
    }

    @FunctionalInterface
    interface Action {
        void execute(String message); // abstract method
    }

    public static void main(String[] args) {
        // Creating a thread using the Thread class
        Thread thread = new Thread(new Runnable() {
            public void run() {
                System.out.println("Hello from a thread created using the Thread class!");
            }
        });

        // Starting the thread
        thread.start();

        // Using a lambda expression with a parameter
        performAction((message) -> System.out.println("Message: " + message), "Hello, Thread!");
    }
}
