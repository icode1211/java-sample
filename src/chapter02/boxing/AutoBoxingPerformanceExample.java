package chapter02.boxing;

/**
 * 오토박싱과 박싱 성능 비교
 * 출력결과 :
 * [오토박싱] 실행 시간: 16ms
 * [박싱] 실행 시간: 15ms
 */
public class AutoBoxingPerformanceExample {
    public static void main(String[] args) {
        long startTimeMs1 = System.currentTimeMillis();
        for (int i1 = 0; i1 < 1000000; i1++) {
            Integer number2 = 11;   // 오토박싱
        }
        System.out.println("[오토박싱] 실행 시간: " + (System.currentTimeMillis() - startTimeMs1) + "ms");

        long startTimeMs = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            Integer number = Integer.valueOf(11);  // 박싱
        }
        System.out.println("[박싱] 실행 시간: " + (System.currentTimeMillis() - startTimeMs) + "ms");
    }

}