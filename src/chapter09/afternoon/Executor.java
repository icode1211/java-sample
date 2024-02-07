package chapter09.afternoon;

import java.io.IOException;

public class Executor {
    public static void main(String[] args) {
        test2();
    }

    public static void test2() {
        test3();
        try {
            throw new IOException();
        } catch (IOException e) {
            System.out.println("예외처리지옥");
        }
    }

    public static void test3() {
        try {
            exceptionTest();
            exceptionTest2();
        } catch (XXXException e) {
            System.out.println("XXXException 예외처리");
        }
    }

    public static void exceptionTest() {
        // 던지거나(throws), 본인이 처리하거나(try-catch)
        throw new RunXXXException("런타임 예외 던지기");
    }

    public static void exceptionTest2() throws XXXException {
        throw new XXXException("checked 예외 던지기");
    }
}
