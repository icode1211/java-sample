package chapter03;

public class DenyLogicOperatorExample {
    public static void main(String[] args) {
        boolean play = true;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        play = !play;
        System.out.println(play);

        char c1 = 'A' + 1;   // 'B' (유니코드 66은 문자 B)
        char c2 = 'A';
        char c3 = (char) (c2 + 1);   // 에러
    }
}
