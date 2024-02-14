package chapter10.bounded;

import static chapter10.bounded.Util.compare;

public class BoundedTypeExample {
    public static void main(String[] args) {
//        int result = Util.compare("a", "b");

        int result = compare(1, 2);   // int -> Integer
        System.out.println(result);

        int result2 = compare(4.5, 4.5);
        System.out.println(result2);
    }
}
