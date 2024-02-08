package chapter10;

import java.util.ArrayList;
import java.util.List;

public class Sample {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("Hello");
        String str = (String) list.get(0); // Object -> String

        List<String> list2 = new ArrayList<>();
        list2.add("Hi");
        String str2 = list2.get(0);        // 타입 변환이 필요 없음

        Box<String> stringBox = new Box<>();
        String str3 = stringBox.get();
    }
}
