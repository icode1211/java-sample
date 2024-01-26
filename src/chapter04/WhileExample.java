package chapter04;

/* 10번 찍어 넘어가는 나무 프로그램을 while문으로 구현 */
public class WhileExample {
    public static void main(String[] args) {
        int treeHit = 0;
        while (treeHit < 10) {
            treeHit++;  // treeHit += 1 로도 표현 가능
            System.out.println("나무를  " + treeHit + "번 찍었습니다.");
            if (treeHit == 10) {
                System.out.println("나무 넘어갑니다.");
            }
        }
    }
}
