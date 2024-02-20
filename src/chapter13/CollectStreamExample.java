package chapter13;

import java.util.*;
import java.util.stream.Collectors;

public class CollectStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "a", "b");

        List<String> returnList = list.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(returnList);

        Set<Integer> set = Arrays.asList(1, 2, 3, 4, 5).stream()
                .filter(n -> n % 2 == 1)
                .peek(System.out::println)
//                .collect(Collectors.toSet());
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println("set: " + set);


        List<Integer> list2 = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);
        Map<Integer, Long> result = list2.stream()
                .collect(
                        Collectors.groupingBy(
                                n -> n,
                                Collectors.counting()  // 그룹핑 후 집계하는 메소드
                        )
                );
        result.forEach((key, value) -> System.out.println(key + ": " + value + "개"));
    }
}
