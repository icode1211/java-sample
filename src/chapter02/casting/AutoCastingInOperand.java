package chapter02.casting;

public class AutoCastingInOperand {
    public static void main(String[] args) {
        int intValue = 10;
        double doubleValue = 5.5;
        double result = intValue + doubleValue;

        System.out.println(result);


        int intValue2 = 10;
        double doubleValue2 = 5.5;
        int result2 = intValue2 + (int)doubleValue2;

        System.out.println(result2);
    }
}
