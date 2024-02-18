package chapter09.exception;

public class Calculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.printDivide(1, 2);
        calculator.printDivide(1, 0);

        /* 1. 만약 매개변수 두번째 값이 0이면 "Second value can't be zero"라는 메시지를 갖는
        예외를 발생 시켜 봅시다.
        그리고 발생 시킨 예외를 throw 할 수 있도록 코드를 수정 해 봅시다. */
    }

    public void printDivide(double d1, double d2) {
        double result = d1/d2;
        System.out.println(result);
    }
}
