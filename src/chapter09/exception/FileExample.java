package chapter09.exception;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        System.out.println("1");
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
            String line = reader.readLine();
            System.out.println("2");

        } catch (IOException e) {
            System.out.println("파일 입출력 오류!");
            System.out.println("3");
        }
    }
}
