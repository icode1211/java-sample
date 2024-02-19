package chapter12.example;

public class FunctionalExample {
    public static void main(String[] args) {
        MyFunctionalInterface f = () -> System.out.println("람다식");
        f.method();

        MyFunctionalInterface2 f2 = a -> {
            System.out.println(a);
        };
        f2.method(2);

        MyFunctionalInterface3 f3 = (a, b) -> a * b;
        System.out.println(f3.method(2, 3));
    }
}
