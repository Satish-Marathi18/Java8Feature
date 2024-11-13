package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class ForEachMethodUsingArrays {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(84,28,29,37,47);
        list.sort(Comparator.reverseOrder());

//        Consumer<Integer> consumer = new Consumer<Integer>() {
//
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer);
//            }
//        };
//
//        Consumer<Integer> consumer = integer -> System.out.print(integer+" ");


        list.forEach(integer -> System.out.print(integer+" "));
    }
}
