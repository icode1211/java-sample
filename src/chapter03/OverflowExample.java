package chapter03;

public class OverflowExample {
    public static void main(String[] args) {
        int a = 1000000;
        int b = 1000000;
        int c = a * b;

        System.out.println(c);

        char c1 = 'A' + 1;   // 'B' (유니코드 66은 문자 B)
        char c2 = 'A';
//        char c3 = c2 + 1;   // 에러

        double ab = 10;
        double cd = 0;
        System.out.println(Double.isInfinite(ab / cd));
        System.out.println(Double.isNaN(ab % cd));

        if (0.1 == 0.1f) {
            System.out.println("a, b가 같습니다");
        } else if (0.1 != 0.1f) {
            System.out.println("a, b가 다릅니다");
        }
    }
}
