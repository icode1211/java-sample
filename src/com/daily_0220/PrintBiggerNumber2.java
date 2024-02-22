package com.daily_0220;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * 1. 큰 수 출력하기 (Stream Ver.)
 */
public class PrintBiggerNumber2 {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();

        // 코드 작성
        answer.add(array[0]);

        List<Integer> collect = IntStream.range(1, n)  // 1,2,3,4...n
                .filter(index -> array[index] > array[index - 1])
                .mapToObj(e -> array[e]).toList();

        answer.addAll(collect);
        return answer;
    }

    public static void main(String[] args) {
        PrintBiggerNumber2 printMoreBigNumber = new PrintBiggerNumber2();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        for (int x : printMoreBigNumber.solution(number, array)) {
            System.out.print(x + " ");
        }
    }
}
