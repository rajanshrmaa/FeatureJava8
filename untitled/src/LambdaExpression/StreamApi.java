package LambdaExpression;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {
        // Example of using Stream API to process a list of integers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using Stream API to filter and print even numbers
        numbers.stream()
               .filter(n -> n % 2 == 0)
               .forEach(System.out::println);
    }
}
