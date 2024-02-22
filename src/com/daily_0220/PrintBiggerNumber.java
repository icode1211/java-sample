package com.daily_0220;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1. 큰 수 출력하기 (Not Stream Ver.)
 * 6
 * 7 3 9 5 6 12
 * 7 9 6 12
 */
public class PrintBiggerNumber {
    public List<Integer> solution(int n, int[] array) {
        List<Integer> answer = new ArrayList<>();

        // 코드 작성
        answer.add(array[0]);
        for (int i = 1; i < n; i++) {
            if (array[i] > array[i-1]) {
                answer.add(array[i]);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        PrintBiggerNumber printMoreBigNumber = new PrintBiggerNumber();
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