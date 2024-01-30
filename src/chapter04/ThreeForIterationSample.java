package chapter04;

import java.util.ArrayList;
import java.util.List;

public class ThreeForIterationSample {
    public static void main(String[] args) {
        // 3중 for문
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {     // i = 1 ~ 3
            for (int j = 1; j <= 3; j++) {   // j = 1 ~ 3
                for (int k = 1; k <= 3; k++) {   // k = 1 ~ 3
                    String value = "" + i + j + k;
                    System.out.println(value);  // ijk 각각의 숫자 출력
                    list.add(Integer.parseInt(value));
                }
            }
        }
        System.out.println("ijk 숫자의 총 갯수는? " + list.size());
    }
}
