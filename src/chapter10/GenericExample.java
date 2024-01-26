package chapter10;

public class GenericExample {
    public static void main(String[] args) {
        Box<String> box = new Box<>();
        box.set("hello");

        String str = box.get();
        System.out.println(str);

        Box<Integer> box2 = new Box<>();
        box2.set(9);

        int value = box2.get();
        System.out.println(value);
    }
}

