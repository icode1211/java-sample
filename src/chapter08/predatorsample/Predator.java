package chapter08.predatorsample;

public interface Predator {     // 육식동물 인터페이스
    String getFood();

    default void printFood() {
        System.out.printf("my food is %s\n", getFood());
    }
}
