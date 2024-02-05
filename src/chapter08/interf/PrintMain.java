package chapter08.interf;

public class PrintMain {
    public static void main(String[] args) {
//        Run child = new Child();
//        Run adult = new Adult();
//        print(child);
//        print(adult);

        Child child = new Child();
        Adult adult = new Adult();
        print(child);
        print(adult);
    }

    static void print(Run run) {
        run.run();
    }
}
