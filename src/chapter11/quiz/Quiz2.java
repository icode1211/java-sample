package chapter11.quiz;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Quiz2 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 3, 5, 8, 2, 2);
        Map<Integer, Integer> map = new HashMap<>();

        for(int i: list) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }else{
                map.put(i,1);
            }
        }

        System.out.println(map);
        // 3=2, 5=1, 8=1, 2=2
    }
}
