package chapter13.quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 수업 중 퀴즈 1
 */
public class Quiz1 {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 1, 2, 2, 2, 3, 4, 5, 5, 5);
        List<String> stringList = integerList.stream()
                .distinct()
                .map(element -> String.valueOf(element))
                .peek(System.out::println)
                .collect(Collectors.toList());

        List<Integer> list = new ArrayList<>();

// NoSuchElementException 예외 발생
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();

        System.out.println(avg);
    }
}
