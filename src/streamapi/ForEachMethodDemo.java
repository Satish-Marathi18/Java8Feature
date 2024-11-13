package streamapi;

import java.util.Arrays;
import java.util.List;

public class ForEachMethodDemo {
    public static void main(String[] args) {
        List<Integer> numsList = Arrays.asList(10,38,48,92,47,46);
        numsList.forEach(n -> System.out.print(n+" "));
    }
}
