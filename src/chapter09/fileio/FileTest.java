package chapter09.fileio;

public class FileTest {
    public static void main(String[] args) {
        String filePath = System.getProperty("user.dir");
        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            inputStream.read();     // 파일을 읽습니다!
            inputStream.close();    // AutoCloseable.close() 재정의
            System.out.println("test");
            throw new Exception();

        } catch (Exception e) {
            System.out.println("Exception 처리");
        }
    }
}
