package chapter15;

/**
 * 공용자원 count
 */
public class CounterShare {
    private int count = 0;

    public void increment() {
        for (int i = 0; i < 10000; i++) {
            count++;
            System.out.println("Increment result: " + count);
        }
    }

    public void decrement() {
        for (int i = 0; i < 10000; i++) {
            count--;
            System.out.println("Decrement result: " + count);
        }
    }
}
