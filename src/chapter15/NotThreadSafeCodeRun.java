package chapter15;

/**
 * 2개의 Thread, Thread Safe하지 않은 코드
 */
public class NotThreadSafeCodeRun {
    public static void main(String[] args) {
        CounterShare counterShare = new CounterShare();
        IncreThread increThread = new IncreThread(counterShare);
        DecreThread decreThread = new DecreThread(counterShare);

        increThread.start();
        decreThread.start();
    }
}
