package java8features;

import java.util.List;
import java.util.stream.Collectors;
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
//        list.forEach(System.out::println); // error : stream has already been operated upon or closed

//        Since a stream cannot be reused once consumed, calling list.forEach() again will result in an error. If you need to process the data multiple times, you should recreate the stream or collect it into a list.


        String[] langauge = {"Hindi","English","bhojpuri"};

        Stream<String> listview = Stream.of(langauge);

//        listview.forEach(System.out::println);
        List<String> filteredNames =   listview.filter(name ->name.startsWith("H")).collect(Collectors.toList());
        System.out.println(filteredNames);
    }
}
