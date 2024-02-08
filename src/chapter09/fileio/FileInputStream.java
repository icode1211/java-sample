package chapter09.fileio;

public class FileInputStream implements AutoCloseable {
    private String file;

    public FileInputStream(String file) {
        this.file = file;
    }

    public void read() {
        System.out.println(file + " 파일을 읽습니다!");
    }
    @Override
    public void close() throws Exception {
        System.out.println("AutoCloseable.close() 재정의. 호출되나?");
    }
}
