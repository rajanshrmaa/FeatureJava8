package LambdaExpression;

public class Lambda {
    public static void main(String[] args) {
        // Using a lambda expression to define a simple function
        Runnable runnable = () -> System.out.println("Hello from a lambda expression!");

        // Executing the lambda expression
        runnable.run();

        // Using a lambda expression with a parameter
        performAction((message) -> System.out.println("Message: " + message), "Hello, Lambda!");
    }

    public static void performAction(Action action, String message) {
        action.execute(message);
    }

    @FunctionalInterface
    interface Action {
        void execute(String message); //abstract method
    }
}
