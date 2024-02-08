package chapter09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryCatchExceptionSample {
    public static void main(String[] args) {
        String filePath = "잘못된파일패스/혹은/정상파일패스입력";

        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filePath));
            br.readLine();
            br.close();     // 위에서 예외 발생시 호출안됨
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException 발생");
        } catch (IOException e) {
            System.out.println("IOException 발생");
        } finally {
            System.out.println("finally");
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    // 예외처리
                }
            }
        }
    }
}
