package chapter10.implement;

public class StorageImpl<T> implements Storage<T> {
    private T[] items;

    public StorageImpl(int capacity) {
        items = (T[]) new Object[capacity];
    }

    @Override
    public void add(T item, int index) {
        items[index] = item;
    }

    @Override
    public T get(int index) {
        return items[index];
    }
}
