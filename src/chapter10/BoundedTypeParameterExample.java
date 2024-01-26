package chapter10;

public class BoundedTypeParameterExample {
    public static void main(String[] args) {
//        String value = Util.compare("a", "b");   // String은 Number 타입이 아니므로 컴파일 오류 발생

        int result1 = Util.compare(1, 2);          // int -> Integer (자동 Boxing)
        System.out.println(result1);

        int result2 = Util.compare(4.5, 3);         // double -> Double (자동 Boxing)
        System.out.println(result2);
    }
}
