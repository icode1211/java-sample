package chapter02;

public class VariableExample {
    public static void main(String[] args) {
        int value = 10;
        if (value == 10) {
            int value2 = 11;
            System.out.println(value2);
        }

        for (int i = 0; i < 5; i++) {
            int value2 = 1;
            System.out.println(value + 1);
            System.out.println(value2 + 1);
        }

        System.out.println(value);
//        System.out.println(value2);
    }
}
