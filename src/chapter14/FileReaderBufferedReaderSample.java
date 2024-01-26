package chapter14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderBufferedReaderSample {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(
                    new FileReader("C:/Users/skqwk/Documents/out.txt"));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
