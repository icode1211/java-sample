package chapter10.generic;

import chapter10.ex.Box;

public class Main {
    public static void main(String[] args) {

        // 문자열을 저장하는 Box 인스턴스 생성
        Box<String> stringBox = new Box<>();
        stringBox.set("Hello, World!");
        String content = stringBox.get();
        System.out.println(content);

        // 정수값을 저장하는 Box 인스턴스 생성
        Box<Integer> integerBox = new Box<>();
        integerBox.set(123);
        int intContent = integerBox.get();
        System.out.println(intContent);
    }
}

