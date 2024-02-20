package chapter13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * 13.4 매핑 - map
 */
public class MapStreamExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("a", "b", "c", "d", "e");
        Stream<String> stringStream = list.stream().map(x -> x.toUpperCase());
        stringStream.forEach(System.out::println);
    }
}
