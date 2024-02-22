package chapter15;

public class IncreThread extends Thread {
    private CounterShare counterShare;

    public IncreThread(CounterShare counterShare) {
        this.counterShare = counterShare;
    }
    @Override
    public void run() {
        counterShare.increment();
    }
}
