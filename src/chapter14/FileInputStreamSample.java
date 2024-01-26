package chapter14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamSample {
    public static void main(String[] args) {
        byte[] b = new byte[1024];

        try {
            FileInputStream inputStream = new FileInputStream("C:/Users/skqwk/Documents/out.txt");
            inputStream.read(b);

            System.out.println(new String(b));
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
