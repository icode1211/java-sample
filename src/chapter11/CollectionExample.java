package chapter11;

import java.util.ArrayList;
import java.util.List;

public class CollectionExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("홍길동");
        list.add(1, "삼길동");
        System.out.println(list);

        String str = list.get(1);
        list.remove(0);
        list.remove(str);
        System.out.println(list);
    }
}
