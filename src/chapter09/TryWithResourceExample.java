package chapter09;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 리소스를 안전하기 닫기 위한 try/catch/finally 지옥
 */
public class TryWithResourceExample {

    public static void main(String[] args) {

        FileInputStream inputStream = null;

        try {
            inputStream = new FileInputStream("file.txt");
			// ...

        } catch (FileNotFoundException e) {
            // FileNotFoundException 예외 처리

        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();

                } catch (IOException e) {
                    // 예외 처리

                }
            }
        }
    }
}
