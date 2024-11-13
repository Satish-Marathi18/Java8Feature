package methodreference;

import java.util.function.Function;

public class IntegerParser {
    public static void main(String[] args) {
        Function<String, Integer> parseInt = Integer::parseInt;
        System.out.println(parseInt.apply("123")+5);

    }
}
