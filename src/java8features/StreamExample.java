package java8features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

        /// Basic to Advanced Stream API Examples

//        1. Creating a Stream
//        A stream can be created from a list, array, or individual elements.

        Stream<String> stream1 = Stream.of("Java", "Python", "C++");
        stream1.forEach(System.out::println);

        String[] languages = {"Java", "Python", "C++"};
        Stream<String> stream2 = Stream.of(languages);
        stream2.forEach(System.out::println);

//        2. Filtering Elements
//        Use .filter() to remove unwanted elements.

        List<String> names = Arrays.asList("John", "Jane", "Jack", "Jill", "Tom");

        List<String> filteredNames = names.stream()
                .filter(name -> name.startsWith("Ja"))
                .collect(Collectors.toList());

        System.out.println(filteredNames);  // Output: [John, Jane, Jack, Jill]


//        3. Mapping Elements (Transformation)
//                Use .map() to modify elements in a stream.

        List<String> nameduplicate = Arrays.asList("john", "jane", "jack");

        List<String> uppercaseNames = nameduplicate.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(uppercaseNames);  // Output: [JOHN, JANE, JACK]


//        4. Sorting a Stream
//        Use .sorted() to sort elements in natural or custom order.

        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 9);

        List<Integer> sortedNumbers = numbers.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedNumbers);  // Output: [1, 2, 5, 8, 9]


//        5. Finding Minimum and Maximum Value
//        Use .min() and .max() to get the smallest and largest elements.

        List<Integer> numbersduplicate = Arrays.asList(3, 7, 2, 8, 5);

        Optional<Integer> min = numbersduplicate.stream().min(Integer::compareTo);
        Optional<Integer> max = numbersduplicate.stream().max(Integer::compareTo);

        System.out.println("Min: " + min.get());  // Output: 2
        System.out.println("Max: " + max.get());  // Output: 8


//        6. Counting Elements
//        Use .count() to get the number of elements.

        List<String> names2 = Arrays.asList("Apple", "Banana", "Cherry", "Avocado");

        long count = names2.stream()
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println("Count: " + count);  // Output: 2



//        7. Reducing Elements (Aggregation - Sum, Average, etc.)
//        Use .reduce() to perform aggregation like sum, product, concatenation, etc.


        List<Integer> numbersD = Arrays.asList(1, 2, 3, 4, 5);

        int sum = numbersD.stream()
                .reduce(0, Integer::sum);
        int product = numbersD.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum: " + sum);  // Output: 15


//        8. Collecting Results (toList, toSet, joining)
//        Use .collect() to transform the stream into a List, Set, or String.

        List<String> namest = Arrays.asList("Java", "Python", "Java", "C++");

        List<String> list = namest.stream().collect(Collectors.toList());
        Set<String> set = namest.stream().collect(Collectors.toSet());
        String joined = namest.stream().collect(Collectors.joining(", "));

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Joined: " + joined);

//        9. Parallel Streams for Faster Processing
//        Use .parallelStream() to process elements in parallel.


        List<Integer> numbersp = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        numbersp.parallelStream().forEach(n -> System.out.println(n + " - " + Thread.currentThread().getName()));


//        10. Grouping and Partitioning Data
//        Use .collect(Collectors.groupingBy()) to group elements.


        List<String> namesU = Arrays.asList("Apple", "Banana", "Avocado", "Blueberry");

        Map<Character, List<String>> grouped = namesU.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(grouped);

    }
}
