package chapter02.boxing;

public class PrimitiveTypePerformanceExample {
    public static void main(String[] args) {
        long startTimeMs = System.currentTimeMillis();
        long sum = 0L;
        for (int i = 0; i < 1000000; i++) {
            sum = sum + 1;
        }
        System.out.println("실행 시간: " + (System.currentTimeMillis() - startTimeMs) + "ms");
    }
}