package chapter10;

public class Box<T> {
    T element;

    void set(T element) {
        this.element = element;
    }

    T get() {
        return element;
    }
}
