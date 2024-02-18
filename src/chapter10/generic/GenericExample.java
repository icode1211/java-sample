package chapter10.generic;

import java.util.ArrayList;

public class GenericExample {
    public static void main(String[] args) {
        // String 타입을 저장하는 ArrayList 생성
        ArrayList<String> list = new ArrayList<>();

        // 문자열 추가
        list.add("Hello");

        // 정수를 추가하려고 하면 컴파일 오류 발생
        // list.add(10); // 컴파일 에러

        // 데이터를 가져올 때 형변환 필요 없음
        String str = list.get(0);

        // 출력
        System.out.println("String: " + str);
    }
}
