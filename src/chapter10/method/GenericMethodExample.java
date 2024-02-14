package chapter10.method;

import chapter10.ex.Box;

import static chapter10.method.Util.*;

public class GenericMethodExample {
    public static void main(String[] args) {
        System.out.println(DEFAULT);
        Box<String> box = boxing("string");
        String str = box.get();
        System.out.println(str);
    }
}
