package chapter11.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListPerformance {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();

        long start = System.nanoTime();
        long end;
        for (int i = 0; i < 10000; i++) {
            arrayList.add(0, String.valueOf(i));
        }
        end = System.nanoTime();
        System.out.println((end - start) + "ns");

        start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(0, String.valueOf(i));
        }
        end = System.nanoTime();
        System.out.println((end - start) + "ns");
    }
}
