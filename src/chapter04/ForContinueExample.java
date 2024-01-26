package chapter04;

/* 점수가 70점 이상일 때 합격 메시지 출력하는 프로그램 */
public class ForContinueExample {
    public static void main(String[] args) {
        int[] marks = {90, 25, 67, 45, 80};

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 70) {
                continue;
            }
            System.out.println((i + 1) + "번 학생, 축하합니다 합격입니다!");
        }
    }
}
