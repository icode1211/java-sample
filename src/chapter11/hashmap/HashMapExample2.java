package chapter11.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample2 {
    public static void main(String[] args) {
        // 1. Map 컬렉션 생성
        Map<String, Integer> map = new HashMap<>();
        map.put("금요일", 90);
        map.put("토요일", 100);
        map.put("일요일", 100);

        // 2. 객체 찾기
        System.out.println("총 Entry 수: " + map.size());
        System.out.println("토요일 찾기 : " + map.get("토요일"));

        // 3. 객체를 하나씩 처리
        Set<String> keySet = map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.getOrDefault(key, 0);
            System.out.println("\tkey:" + key + ", value:" + value);
        }

        // 4. 객체 삭제
        map.remove("금요일");
        System.out.println(map);

        // 5. 객체를 하나씩 처리 (EntrySet 얻기)
        Set<Map.Entry<String, Integer>> entrySet =  map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.println("\tkey:" + entry.getKey() + ", value:" + entry.getValue());
        }

        // 6. 모든 Map.Entry 삭제
        map.clear();
        System.out.println("삭제 후 map size: " + map.size());
    }
}
