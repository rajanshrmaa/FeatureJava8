1. Java Multithreading Tutorial
What:
Multithreading allows multiple threads (smallest unit of a process) to run concurrently, enabling parallel execution.

When:
Use when you want to perform multiple tasks at the same time—e.g., background tasks, animations, or handling multiple client requests.

Where:
In applications like games, servers, or any performance-critical real-time systems.

How:
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running...");
    }
}

public class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        t1.start();
    }
}
2. Synchronization in Java
What:
Synchronization is used to control access to shared resources by multiple threads to prevent data inconsistency.

When:
Use it when multiple threads access and modify the same data or object.

Where:
In multithreaded applications like banking systems, inventory systems, etc.

How:

java
Copy
Edit
synchronized void print() {
    // critical section
}
3. File Handling in Java
What:
File handling enables Java programs to create, read, write, and modify files.

When:
Use when your application needs to store data persistently or read from external files.

Where:
In logging systems, configuration readers, or report generators.

How:
FileWriter writer = new FileWriter("output.txt");
writer.write("Hello, File!");
writer.close();
4. Java Method References
What:
A shorthand syntax to call methods using :: operator, introduced in Java 8.

When:
Use to make lambda expressions cleaner and more readable.

Where:
In functional programming with Java Streams or collections.

How:
List<String> names = Arrays.asList("Raj", "Ankit");
names.forEach(System.out::println);  // method reference
5. Java 8 Stream Tutorial
What:
Streams allow functional-style operations on collections (filter, map, reduce).

When:
Use when you want to process collections efficiently and declaratively.

Where:
In any data transformation scenario like filtering, aggregation, sorting.

How:
List<String> names = Arrays.asList("Ram", "Shyam", "Raju");
names.stream()
     .filter(name -> name.startsWith("R"))
     .forEach(System.out::println);
6. Java Networking
What:
Java networking enables communication between applications over a network using protocols like TCP/IP, HTTP.

When:
Use when building client-server applications, web-based applications, or chat systems.

Where:
In sockets, REST API calls, file transfers, etc.

How:
Socket s = new Socket("localhost", 8080);
OutputStream out = s.getOutputStream();
out.write("Hello Server".getBytes());
7. JDBC Tutorial
What:
JDBC (Java Database Connectivity) is an API to connect and interact with relational databases.

When:
Use when your application needs to perform CRUD operations on a database.

Where:
In web applications, enterprise software, inventory systems.

How:
Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db", "user", "pass");
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
8. Java Memory Management
What:
It refers to the process of allocating and deallocating memory (heap, stack, etc.) to objects.

When:
Always in action; understanding helps in writing efficient, high-performance apps.

Where:
In JVM architecture; key in large-scale, long-running applications.

How:
Java automatically manages memory using garbage collection. Developers can optimize memory usage by minimizing unnecessary object creation.

9. Garbage Collection in Java
What:
GC is a process in JVM that removes unused objects to free up memory.

When:
Happens automatically; manual GC can be invoked via System.gc() (not recommended for production).

Where:
Especially useful in server-side applications where memory leaks are common.

How:
System.gc(); // Suggests JVM to perform GC
10. Memory Leaks in Java
What:
A memory leak occurs when objects are no longer used but are still referenced, preventing GC from reclaiming memory.

When:
Happens due to poor programming, such as holding unnecessary references.

Where:
Common in long-running apps like web servers or desktop tools.

How to Avoid:

Use weak references when necessary

Close resources (DB, file, stream) properly

Use tools like VisualVM to monitor memory
