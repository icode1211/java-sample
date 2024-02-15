package chapter11.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        // 객체 생성
        Set<String> stringSet = new HashSet<>();
        stringSet.add("요소1");
        stringSet.add("요소2");
        stringSet.add("요소3");
        stringSet.add("요소1");   // List와는 다른 차이점!
        System.out.println(stringSet);

        // 객체 검색
        Iterator<String> iterator = stringSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(stringSet.size());

        // 향상된 for문
        for (String str : stringSet) {
            System.out.println(str);
        }

        // 객체 삭제
        boolean isRemoved = stringSet.remove("없는요소");
        System.out.println("isRemoved = " + isRemoved);
        stringSet.clear();
        System.out.println(stringSet);

        Set<Member> personSet = new HashSet<>();
        personSet.add(new Member("", 10));
    }
}
