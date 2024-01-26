package chapter12;

// 리턴값이 없는 람다식 예제
public class MyFunctionalInterfaceExample3 {
    public static void main(String[] args) {
        MyFunctionalInterface2 finter2;

        finter2 = (x) -> {
            int result = x * 5;
            System.out.println(result);
        };
        finter2.method(2);

        finter2 = (x) -> {
            System.out.println(x * 5);
        };
        finter2.method(2);

        finter2 = x -> System.out.println(x * 5);
        finter2.method(2);
    }
}
