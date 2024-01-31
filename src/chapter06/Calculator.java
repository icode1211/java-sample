package chapter06;

public class Calculator {
    int result;

    double add(double x, double y) {
        return x + y;
    }

    double divide(double x, double y) {
        return x / y;
    }

    double multiply(int x, int y) {
        return x * y;
    }

    int postfixOperator() {
        result++;
        return result;
    }

    int prefixOperator() {
        return ++result;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.result = (int) calculator.add(1, 5);
        System.out.println(calculator.result);
    }
}
