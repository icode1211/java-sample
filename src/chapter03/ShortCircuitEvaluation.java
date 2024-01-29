package chapter03;

public class ShortCircuitEvaluation {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        boolean result = (a > b) && (++a > b);
        System.out.println(result);

        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------------");
        int a2 = 1;
        int b2 = 1;

        boolean result2 = (a2 > b2) & (++a2 > b2);
        System.out.println(result2);

        System.out.println(a2);
        System.out.println(b2);
    }
}
