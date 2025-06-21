package StreamsAndLambdas;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClient {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 12, 3, 40, 5, 16, 7, 8, 9, 10);

        Stream<Integer> stream = numbers.stream();
        System.out.println(stream);

        List<Integer>  evenNumbers = stream
                                    .filter(number -> number % 2 == 0)
                                    .map(number -> number * 2)
                                    .collect(Collectors.toList());

        System.out.println(evenNumbers);

        int sum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(sum);

        //You are given a stream of integers. Please use the allMatch method to confirm if all numbers in the stream are even. Use only stream methods.
        boolean allEven = numbers.stream().allMatch(number -> number % 2 == 0);
        System.out.println("Are all numbers even? " + allEven);

        List<String> fruits = Arrays.asList("Apple", "Banana", "Apricot", "Orange", "Avocado", "Grape");
        List<String> aFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .collect(Collectors.toList());
        System.out.println("Fruits starting with 'A': " + aFruits);

        // All distinct numbers
        List<Integer> numbers2 = Arrays.asList(1, 1, 3, 4, 4, 5, 6, 7, 8, 9, 10, 10);
        System.out.println(numbers2.stream().distinct().collect(Collectors.toList()));

        System.out.println(fruits.stream().anyMatch(fruit -> fruit.startsWith("A")));


        String result = fruits.stream().collect(Collectors.joining(","));
        System.out.println(result);

        Map<Integer, List<String>> fruitsByLength = fruits.stream()
                .collect(Collectors.groupingBy(fruit -> fruit.length()));
        System.out.println("Fruits grouped by length: " + fruitsByLength);

        Set<String> uniqueFruits = fruits.stream().collect(Collectors.toSet());
        System.out.println("Result: " + uniqueFruits);
    }
}
