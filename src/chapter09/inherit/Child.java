package chapter09.inherit;

import java.io.FileNotFoundException;

public class Child extends Parent {
    @Override
    void test() throws FileNotFoundException {
        System.out.println("");
        throw new FileNotFoundException();
    }
}
