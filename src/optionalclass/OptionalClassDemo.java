package optionalclass;

import java.util.Optional;

public class OptionalClassDemo {
    public static void main(String[] args) {
        String s = "Satish";
        Optional<String> optional = Optional.ofNullable(s);
        optional.ifPresent(System.out::println);

    }
}
