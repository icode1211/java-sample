package chapter10.bounded;

public class Util {
    public static <T extends Number> int compare(T t1, T t2) {
        double value1 = t1.doubleValue();
        double value2 = t2.doubleValue();
        // value1이 작다면 -1, value1이 크다면 1, 같다면 0
        return Double.compare(value1, value2);
    }
}
