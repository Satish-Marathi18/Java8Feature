package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemo1 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(38,48,29,58,89,74);
        boolean found = nums.stream()
                        .anyMatch(n -> n>50);
        System.out.println(found);
    }
}
