import java8features.Addition;

public class Lambdaexpressions {

    public static void main(String[] args) {
        // Using Lambda Expression (Java 8)
         //  Defination:
//        A short way to write anonymous functions (methods without a name).
//        Makes code cleaner and reduces boilerplate code.

        Runnable r2 = () -> System.out.println("Hello, Java 8!");
        r2.run();



       Addition addition =(a, b)-> System.out.println(a+b);
        addition.add(100,100);
    }
}
