package chapter09;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * try문 안에 Exception 발생시, 0 ~ 4번까지 출력 결과는?
 */
public class TryCatchExceptionSample {
    public static void main(String[] args) {
        System.out.println("0");
        String filePath = "잘못된파일패스/혹은/정상파일패스입력";

        BufferedReader br;
        try {
            br = new BufferedReader(new FileReader(filePath));
            br.readLine();
            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException 발생");
            System.out.println("2");
        } catch (IOException e) {
            System.out.println("IOException 발생");
            System.out.println("3");
        } finally {
            System.out.println("finally");
        }
        System.out.println("4");
    }
}
