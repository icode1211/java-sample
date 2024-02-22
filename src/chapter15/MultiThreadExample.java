package chapter15;

class SharedCounter {
    private int count = 0;

    public synchronized void increment() {
        while (count >= 5) {
            try {
                // count가 5 이상이면 대기
                wait();

                // 다른 스레드에게 알림
                notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println("Incremented: " + count);
    }

    public synchronized void decrement() {
        while (count <= 0) {
            try {
                // count가 0 이하이면 대기
                wait();

                // 다른 스레드에게 알림
                notify();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        System.out.println("Decremented: " + count);
    }
}

class IncrementThread extends Thread {
    private SharedCounter sharedCounter;

    public IncrementThread(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedCounter.increment();
        }
    }
}

class DecrementThread extends Thread {
    private SharedCounter sharedCounter;

    public DecrementThread(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            sharedCounter.decrement();
        }
    }
}

/**
 * 1. 현재 상태 그대로 main 돌려보고 결과 확인
 * 2. SharedCounter 클래스의 increment(), decrement()
 *      메소드의 synchronized 키워드 없애고 결과 확인
 */
public class MultiThreadExample {
    public static void main(String[] args) {
        SharedCounter sharedCounter = new SharedCounter();

        IncrementThread incrementThread = new IncrementThread(sharedCounter);
        DecrementThread decrementThread = new DecrementThread(sharedCounter);

        incrementThread.start();
        decrementThread.start();
    }
}
