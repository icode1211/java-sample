package chapter13;

import java.util.*;
import java.util.stream.Stream;

/**
 * 13.4 매핑 - flatmap
 */
public class FlatmapExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello World", "Java stream", "HiStream");
        // [Hello, World, Java, stream]
        list.stream()
                .flatMap(str -> Arrays.stream(str.split(" ")))
                .forEach(System.out::println);   // [Hello,World,Java,stream,HiStream]
    }
}
