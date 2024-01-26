package chapter04;

/* 점수에 맞는 등급 출력하기 */
public class IfElseExample {
    public static void main(String[] args) {
        int score = 93;

        if (score >= 90) {
            System.out.println("등급은 A입니다");
        } else if (score >= 80 && score < 90) {
            System.out.println("등급은 B입니다");
        } else if (score >= 70 && score < 80) {
            System.out.println("등급은 C입니다");
        } else {
            System.out.println("등급은 D입니다");
        }
    }
}
