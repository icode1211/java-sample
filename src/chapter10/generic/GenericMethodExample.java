package chapter10.generic;

import java.util.ArrayList;
import java.util.List;

public class GenericMethodExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String firstElement = Utils.getFirstElement(list);
        System.out.println(firstElement);
    }
}
