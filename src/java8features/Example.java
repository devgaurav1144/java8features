package java8features;

import java.util.stream.Stream;

public class Example {

    public static void main(String[] args) {
        Stream<String> list = Stream.of("Java", "Python", "C++");

//        Explanation:
//        Stream<String>: This means the variable list is a Stream of String type.
//                Stream.of(...): This is a factory method provided by the Stream API in Java to create a stream from given values.
//                "Java", "Python", "C++": These are the elements of the stream.
//                How It Works:
//        The Stream.of() method creates a stream that contains the provided elements.
//                Streams are not data structures like lists or arrays. Instead, they provide a functional approach to process collections of data.
//                Streams support operations like filtering, mapping, and reducing.

        list.forEach(System.out::println);

    }
}
