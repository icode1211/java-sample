package chapter02.boxing;

public class UnboxingExample {
    public static void main(String[] args) {
        int index = 20;
        Integer intObject = index;   // 오토박싱

        int index2 = intObject;    // 언박싱
    }
}
