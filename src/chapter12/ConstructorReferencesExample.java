package chapter12;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorReferencesExample {
    public static void main(String[] args) {
        Function<String, Member> f = Member::new;
        f.apply("아이디");   // new Member("아이디");

        BiFunction<String, String, Member> f2 = Member::new;
        f2.apply("이름", "아이디");   // new Member("이름", "아이디");

        Supplier<Member> s = Member::new;
        Member member = s.get();        //new Member()
    }
}
