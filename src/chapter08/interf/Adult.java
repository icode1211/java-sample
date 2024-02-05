package chapter08.interf;

public class Adult implements Walk, Run {
    @Override
    public void run() {
        System.out.println("어른은 빠른 속도로 달립니다.");
    }

    @Override
    public void walk() {
        System.out.println("어른은 빠른 보폭으로 걷습니다.");
    }
}
