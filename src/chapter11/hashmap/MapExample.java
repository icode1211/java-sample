package chapter11.hashmap;

import java.util.*;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> hashmap = new HashMap<>();
        // hashmap 객체 생성, put
        hashmap.put("key1", 1);
        hashmap.put("key2", 2);
        hashmap.put("key3", 3);
        System.out.println(hashmap);

        Integer v = hashmap.getOrDefault("key", 0);
        Integer v2 = hashmap.get("key");
        System.out.println(v);
        System.out.println(v2);


        // 객체 검색
        boolean isContains = hashmap.containsKey("없는key");
        System.out.println("isContains = " + isContains);
        boolean containsValue = hashmap.containsValue(3);
        System.out.println("containsValue = " + containsValue);

        Set<String> keySet = hashmap.keySet();
        System.out.println(keySet);

        Iterator<String> iterator = hashmap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = hashmap.get(key);
            System.out.println(key + ":" + value);
        }

        Set<Map.Entry<String, Integer>> entrySet = hashmap.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(entry);
        }
        Collection<Integer> values = hashmap.values();

    }
}
