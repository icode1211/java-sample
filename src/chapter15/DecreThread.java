package chapter15;

public class DecreThread extends Thread {
    private CounterShare counterShare;

    public DecreThread(CounterShare counterShare) {
        this.counterShare = counterShare;
    }

    @Override
    public void run() {
        counterShare.decrement();
    }
}
