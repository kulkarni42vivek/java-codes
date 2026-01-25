package Java8.StreamApi.Questionss;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Two {
    public static void main(String[] args) {
        List<Double> list1 = Stream.generate(()->Math.random()).limit(10).collect(Collectors.toList());
        List<Double> list2 = list1.stream().limit(5).skip(2).collect(Collectors.toList());

        System.out.println(list2);
    }
}
