package chapter08.interf;

public class Child implements Walk, Run {
    @Override
    public void run() {
        System.out.println("어린아이가 달립니다.");
    }

    @Override
    public void walk() {
        System.out.println("어린아이가 작은 보폭으로 걷습니다.");
    }
}
