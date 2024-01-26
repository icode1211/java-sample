package chapter02.casting;

public class ForceCasting {
    public static void main(String[] args) {

        // long -> int
        long longValue = 300;
        int intValue = (int) longValue;
        System.out.println(intValue);

        // double -> int
        double doubleValue = 3.14;
        int intValue2 = (int) doubleValue;
        System.out.println(intValue2);
    }
}
