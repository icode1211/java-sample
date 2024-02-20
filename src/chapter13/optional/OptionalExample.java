package chapter13.optional;

import java.util.*;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        OptionalDouble optionalDouble = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        // 1. isPresent()로 방어 처리
        if (optionalDouble.isPresent()) {
            double avg = optionalDouble
                    .getAsDouble();
            System.out.println(avg);
        }

        // 2. orElse() default값 셋팅
        double average = optionalDouble.orElse(0.0);
        System.out.println("avg = " + average);

        // 3. ifPresent()
        optionalDouble
                .ifPresent(System.out::println);  // 평균 값이 있을 경우에만 출력
    }
}
