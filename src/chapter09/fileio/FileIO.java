package chapter09.fileio;

import java.io.*;

public class FileIO {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
             BufferedWriter writer = new BufferedWriter(new FileWriter("file2.txt"))) {
            String line = reader.readLine();
            writer.flush();

        } catch (IOException e) {
            // 예외 처리
            System.out.println(e.getMessage());
        }
    }
}
