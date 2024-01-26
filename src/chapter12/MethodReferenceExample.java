package chapter12;

import java.util.function.IntBinaryOperator;

// 정적 메소드와 인스턴스 메소드 참조
public class MethodReferenceExample {
    public static void main(String[] args) {
        IntBinaryOperator operator;

        // 정적 메소드 참조
        operator = (x, y) -> Calculator.staticMethod(x, y);
        System.out.println("결과1: " + operator.applyAsInt(1, 2));

        operator = Calculator::staticMethod;
        System.out.println("결과2: " + operator.applyAsInt(3, 4));

        // 인스턴스 메소드 참조
        Calculator calculator = new Calculator();
        operator = (x, y) -> calculator.instanceMethod(x, y);
        System.out.println("결과3: " + operator.applyAsInt(5, 6));

        operator = calculator::instanceMethod;
        System.out.println("결과4: " + operator.applyAsInt(7, 8));
    }
}
