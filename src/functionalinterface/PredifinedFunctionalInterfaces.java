package functionalinterface;
import  java.util.function.*;

public class PredifinedFunctionalInterfaces {
    public static void main(String[] args) {
        Function<Integer, String> conversion = (num) -> Integer.toString(num);
        System.out.println(conversion.apply(10));

        Predicate<String> isEmpty = (str) -> str.isEmpty();
        System.out.println(isEmpty.test(""));

        Consumer<String> print = (str) -> System.out.println(str);
        print.accept("Hello world");

        Supplier<Double> random = () -> Math.random();
        System.out.println(random.get());
    }
}
