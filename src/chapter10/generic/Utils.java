package chapter10.generic;

import java.util.List;

public class Utils {
    public static <T> T getFirstElement(List<T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }
}


