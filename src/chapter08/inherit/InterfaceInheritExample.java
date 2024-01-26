package chapter08.inherit;

public class InterfaceInheritExample {
    public static void main(String[] args) {
        ImplementsC implC = new ImplementsC();

        InterfaceA interA = implC;
        interA.methodA();
        System.out.println("---------------");

        InterfaceB interB = implC;
        interB.methodB();
        System.out.println("---------------");

        InterfaceC interC = implC;
        interC.methodA();
        interC.methodB();
        interC.methodC();
    }
}
