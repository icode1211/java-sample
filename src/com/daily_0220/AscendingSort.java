package com.daily_0220;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

/**
 * 2. 두 배열 합치기 (Stream Ver.)
 *
 * input
 * 3
 * 1 3 5
 * 5
 * 2 3 6 7 9
 * output
 * 1 2 3 3 5 6 7 9
 */
public class AscendingSort {
    public Integer[] solution(int[] array1, int[] array2) {
        // 코드 작성
        Integer[] obj = Stream.concat(Arrays.stream(array1).boxed(), Arrays.stream(array2).boxed())
                .sorted().toArray(x -> new Integer[array1.length + array2.length]);
        return obj;
    }

    public static void main(String[] args) {
        AscendingSort ascendingSort = new AscendingSort();
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scanner.nextInt();
        }

        int number2 = scanner.nextInt();
        int[] array2 = new int[number2];

        for (int i = 0; i < number2; i++) {
            array2[i] = scanner.nextInt();
        }

        for (Integer x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}