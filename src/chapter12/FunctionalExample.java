package chapter12;

import java.util.function.*;

public class FunctionalExample {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("출력문 테스트");
        r.run();    // "출력문 테스트"

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("출력문 테스트");
            }
        };
        r1.run();

        Supplier<String> s = () -> "리턴값";
        System.out.println(s.get());

        Consumer<Integer> c = x -> System.out.println(x);
        c.accept(3);

        Consumer<Double> cd = x -> System.out.println(x);
        cd.accept(4.5);

        DoubleConsumer d = System.out::println;
        d.accept(4.5);

        Function<String, Integer> f = Integer::parseInt;
        f.apply("1234");

        Function<Integer, String> f3 = String::valueOf;

        Predicate<Integer> p = a -> {
            boolean is = false;

            is = a % 2 == 0;

            return is;
        };
        System.out.println(p.test(10));   // ?
    }
}
