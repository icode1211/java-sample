package chapter11.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashExample {
    public static void main(String[] args) {
        Map<Student, Integer> map = new HashMap<>();

        map.put(new Student(50, "홍길동"), 95);        // 학번과 이름이 동일한 Student를 키로 저장
        map.put(new Student(50, "홍길동"), 95);

        System.out.println("총 Entry 수: " + map.size());    // 저장된 총 Map.Entry 수 얻기
    }
}
