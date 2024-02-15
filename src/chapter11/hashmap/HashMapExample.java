package chapter11.hashmap;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("홍길동", 85);
        map.put("카리나", 85);
        map.put("제시카", 95);
        map.put("홍길동", 80);
        System.out.println("총 Entity 수:" + map.size());
        System.out.println("map = " + map);

        System.out.println("\t홍길동: " + map.get("홍길동"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println("\t" + key + ": " + value);
        }
        System.out.println();

        // 객체 삭제
        map.remove("홍길동");
        System.out.println("총 Entity 수:" + map.size());
    }
}
