package chapter13.quiz;

public class Member {
    private String name;
    private String favoriteColor;
    private int age;

    public Member(String name, String favoritColor, int age) {
        this.name = name;
        this.favoriteColor = favoritColor;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public int getAge() {
        return age;
    }
}
