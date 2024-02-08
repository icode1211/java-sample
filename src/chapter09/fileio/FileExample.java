package chapter09.fileio;

import java.io.*;

public class FileExample {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir") + "/src/test.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            System.out.println(br.readLine());

        } catch (IOException e) {
            System.out.println("예외처리 로직");
        }
    }
}
