package chapter09;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList();
        list.add("str");
        list.add("1234");
        list.add("4.5");
        String str = list.get(1);       // Type 변환 불필요
        String str2 = list.get(2);

        ArrayList list2 = new ArrayList();
        list2.add("str");
        list2.add(1234);
        list2.add(4.5);
        String str3 = (String) list2.get(1);        // ClassCastException
        String str4 = (String) list2.get(2);        // ClassCastException
    }
}
