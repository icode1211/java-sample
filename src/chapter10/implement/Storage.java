package chapter10.implement;

public interface Storage<T> {
    void add(T item, int index);

    T get(int index);
}
