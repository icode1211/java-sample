package chapter01;                                  // 패키지명

import java.util.ArrayList;                         // 사용하는 클래스 import
import java.util.List;

public class SampleClass {                          // 클래스
    public static void main(String[] args) {        // 메소드
        List<String> list = new ArrayList();
        System.out.println("Hello World! " + list);
    }
}
