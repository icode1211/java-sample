package chapter14;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSample {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("C:/Users/skqwk/Documents/out.txt");
            for (int i = 0; i < 10; i++) {
                String data = i + "번째 라인입니다.\r\n";
                fileWriter.write(data);
            }
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
