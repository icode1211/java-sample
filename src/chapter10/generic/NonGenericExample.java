package chapter10.generic;

import java.util.ArrayList;

public class NonGenericExample {
    public static void main(String[] args) {
        // Object 타입을 저장하는 ArrayList 생성
        ArrayList list = new ArrayList();

        // 문자열과 정수를 추가
        list.add("Hello");
        list.add(10);

        // 데이터를 가져올 때 형변환 필요
        String str = (String) list.get(0);
        int num = (int) list.get(1);

        // 출력
        System.out.println("String: " + str);
        System.out.println("Integer: " + num);

        // 잘못된 형변환 시 예외 발생
        int num2 = (int) list.get(0);  // ClassCastException
    }
}
