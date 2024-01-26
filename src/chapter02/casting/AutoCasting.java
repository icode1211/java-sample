package chapter02.casting;

public class AutoCasting {
    public static void main(String[] args) {
        byte byteValue = 10;
        int intValue = byteValue;        // 타입 변환 (byte -> int)
        System.out.println(intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.println("'가'의 유니코드= " + intValue);

        intValue = 500;
        long longValue = intValue;        // 타입 변환 (int -> long)
        System.out.println(longValue);

        intValue = 200;
        double doubleValue = intValue;    // 타입 변환 (int -> double)
        System.out.println(doubleValue);
    }
}
