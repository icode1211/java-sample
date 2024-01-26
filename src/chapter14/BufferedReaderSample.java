package chapter14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedReaderSample {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String a = bufferedReader.readLine();
        System.out.println(a);
    }
}
