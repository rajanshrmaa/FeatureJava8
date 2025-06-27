package MultiThreading;

public class ThreadCreationUsingLambda {
//    public static void main(String[] args) {
//        // Creating a thread using a lambda expression
//        Thread thread = new Thread(() -> {
//            System.out.println("Hello from a thread created using a lambda expression!");
//        });
//
//        // Starting the thread
//        thread.start();
//
//        // Using a lambda expression with a parameter
//        performAction((message) -> System.out.println("Message: " + message), "Hello, Lambda in Thread!");
//    }
//
//    public static void performAction(Action action, String message) {
//        action.execute(message);
//    }
//
//    @FunctionalInterface
//    interface Action {
//        void execute(String message); // abstract method
//    }
    public static void main(String[] args)
    {
        Runnable basic = () ->
        {
            String threadName = Thread.currentThread().getName();
            System.out.println("Running common task by " + threadName);
        };

        // Instantiating two thread classes
        Thread thread1 = new Thread(basic);
        Thread thread2 = new Thread(basic);

        // Running two threads for the same task
        thread1.start();
        thread2.start();
    }
}
