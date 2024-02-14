package chapter10.implement;

import chapter10.inherit.Tv;

public class StorageImplExample {
    public static void main(String[] args) {
        Storage<Tv> tvStorage = new StorageImpl<>(10);
        tvStorage.add(new Tv(), 0);
        System.out.println(tvStorage.get(0));

        Storage<String> stringStorage = new StorageImpl<>(2);
        stringStorage.add("string가능", 0);
        System.out.println(stringStorage.get(0));
    }
}
