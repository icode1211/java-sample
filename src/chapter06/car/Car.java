package chapter06.car;

public class Car {
    String company;
    int speed;
    String sw = "samsung";

    Sheet sheet;

    Car() {
        company = "kia";
        speed = 200;
        sheet = new Sheet("default");
    }

    Car(String company, int speed) {
        this.company = company;
        this.speed = speed;
        sheet = new Sheet("cool");
    }

    void changeSoftware() {
        sw = "kakao";
    }

    void printSpec() {
        String spec = String.format("company: %s, speed: %s, sw: %s, sheet: %s",
                company, speed, sw, sheet.type);
        System.out.println(spec);
    }
}
