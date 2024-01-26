package chapter02.boxing;

import java.util.ArrayList;

public class AutoBoxingExample {
    public static void main(String args[]) {
        int index = 11;
        Integer number = Integer.valueOf(index);  // 박싱(Boxing)

        int index2 = 11;
        Integer number2 = index2;   // 오토박싱


        ArrayList<Integer> arrayList = new ArrayList<>();
        /* 오토 박싱 */
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("ArrayList: " + arrayList);
    }
}
