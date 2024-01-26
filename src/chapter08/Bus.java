package chapter08;

public class Bus implements Vehicle {
    @Override
    public void run() {
        System.out.println("버스가 달립니다!");
    }

    void stop() {
        System.out.println("버스가 멈췄습니다.");
    }
}
