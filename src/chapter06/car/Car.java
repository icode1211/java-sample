package chapter06.car;

public class Car {
    String company;
    int speed;
    String sw = "samsung";
    Sheet sheet;

    String model;

    Car() {
        this("kia", 200);
        sheet = new Sheet("default");
    }

    Car(String company, int speed) {
        this.company = company;
        this.speed = speed;
        sheet = new Sheet("cool");
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    void setModel(String model) {
        this.model = model;
    }

    void changeSoftware() {
        sw = "kakao";
    }

    int getSpeed() {
        return speed;
    }

    void printSpec() {
        String spec = String.format("company: %s, speed: %s, sw: %s, sheet: %s",
                company, speed, sw, sheet.type);
        System.out.println(spec);
    }
}
