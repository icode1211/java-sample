package chapter10;

public class GenericMethodExample {
    public static void main(String[] args) {
        Box<Integer> box1 = Util.boxing(100);
        int intValue = box1.get();

        Box<String> box2 = Util.boxing("홍길동");
        String strValue = box2.get();
    }
}
