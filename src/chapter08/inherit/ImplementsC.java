package chapter08.inherit;

public class ImplementsC implements InterfaceC {
    @Override
    public void methodA() {
        System.out.println("A 메소드 실행");
    }

    @Override
    public void methodB() {
        System.out.println("B 메소드 실행");
    }

    @Override
    public void methodC() {
        System.out.println("C 메소드 실행");
    }
}
