package chapter15;

public class MultiThread implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            System.out.println("[Thread " + Thread.currentThread().getName() + "] i: " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(new MultiThread(), "A");
        Thread t2 = new Thread(new MultiThread(), "B");

        t1.start();
        t2.start();
    }
}
