package chapter09.exception;

import java.util.Scanner;

public class UserInputCalculator {
    public static void main(String[] args) {
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요 (종료하려면 0 입력): ");
        while (true) {
            System.out.print("정수 입력: ");
            String input = scanner.nextLine();
            int num = 0;
            try {
                num = Integer.parseInt(input);
                // 0 입력 시 반복문 종료
                if (num == 0) {
                    break;
                }
                sum += num;
            } catch (NumberFormatException e) {
                System.out.println("적절한 입력이 아닙니다" + input);
            } finally {

            }
        }
        System.out.println("입력한 정수의 합: " + sum);
    }
}
