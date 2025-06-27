package MultiThreading;

public class BasicMutithreading extends Thread {
    public void run(){
        System.out.println("Running common task by Multithreading");
    }
    public static void main(String[] args) {
        BasicMutithreading thread1 = new BasicMutithreading();
        // Starting single threads for the same task
        thread1.start();
    }
}
