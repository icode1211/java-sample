package com.daily_0220;

import java.util.Scanner;

/**
 * 2. 두 배열 합치기 (Not Stream Ver.)
 * while 반복문으로 풀이
 */
public class AscendingSort2 {
    public int[] solution(int[] array1, int[] array2) {
        int[] result = new int[array1.length + array2.length];

        int i = 0, j = 0;
        int index = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                result[index++] = array1[i++];
            } else {
                result[index++] = array2[j++];
            }
        }
        while (i < array1.length) {
            result[index++] = array1[i++];
        }
        while (j < array2.length) {
            result[index++] = array2[j++];
        }

        return result;
    }

    public static void main(String[] args) {
        AscendingSort2 ascendingSort = new AscendingSort2();
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

        for (int x : ascendingSort.solution(array, array2)) {
            System.out.print(x + " ");
        }
    }
}
