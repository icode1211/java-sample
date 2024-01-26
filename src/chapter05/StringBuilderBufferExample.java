package chapter05;

public class StringBuilderBufferExample {
    public static void main(String[] args) {
        String result = "";
        result += "Hello ";
        result += "Java ";
        result += "World!";
        System.out.println(result);

        StringBuilder builder = new StringBuilder();
        builder.append("Hello ");
        builder.append("Java ");
        builder.append("World!");
        System.out.println(builder);

        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello ");
        buffer.append("Java ");
        buffer.append("World!");
        System.out.println(buffer.substring(6));
        System.out.println(buffer.substring(6, 7));
    }

}
