package chapter13;

import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        String[] arr = {"첫번째", "두번째"};
        Stream<String> stream = Arrays.stream(arr);
        stream.forEach(System.out::println);
        System.out.println();

        IntStream intStream = IntStream.range(1, 5);
        intStream.forEach(System.out::println);
        System.out.println();

        LongStream longStream = LongStream.rangeClosed(1l, 5l);
        longStream.forEach(System.out::println);
        System.out.println();

        DoubleStream doubleStream = DoubleStream.of(1.1, 2.2);
        doubleStream.forEach(System.out::println);
        System.out.println();

        List<String> list = Arrays.asList("a", "b", "b", "c", "d");
        list.stream().distinct().forEach(System.out::println);
    }
}
