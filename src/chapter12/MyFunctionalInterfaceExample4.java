package chapter12;

// 리턴값이 있는 람다식 예제
public class MyFunctionalInterfaceExample4 {
    public static void main(String[] args) {
        MyFunctionalInterface4 finter4;

        finter4 = (x, y) -> {
            int result = x + y;
            return result;
        };
        System.out.println(finter4.method(2, 5));

        finter4 = (x, y) -> {
            return x + y;
        };
        System.out.println(finter4.method(2, 5));

        finter4 = (x, y) -> x + y;
        System.out.println(finter4.method(2, 5));
    }
}
