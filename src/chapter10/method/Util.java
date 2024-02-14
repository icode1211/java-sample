package chapter10.method;


import chapter10.ex.Box;

public class Util {
    static final String DEFAULT = "default";
    public static <T> Box<T> boxing(T t) {
        Box<T> box = new Box<>();
        box.set(t);
        return box;
    }

}
