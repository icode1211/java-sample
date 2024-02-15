package chapter11.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // 요소 추가
        list.add("첫번째");
        list.add("두번째");
        list.add("두번째");

        // 요소 검색
        String element1 = list.get(0);
        boolean isContains = list.contains("첫번째");
        System.out.println(element1);
        System.out.println("isContains = " + isContains);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // 요소 삭제
        System.out.println(list);
        list.remove(1);
        System.out.println(list);

        list.clear();
        list = null;
        if (list == null || list.isEmpty()) {
            System.out.println("list가 비어있습니다.");
        }
    }
}
