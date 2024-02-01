package chapter06.car;

public class Car {
    final int version = 1;
    String company;
    int speed;
    String sw = "samsung";
    Sheet sheet;
    String model;
    boolean stop;

    Car() {
        this("kia", 200);
        sheet = new Sheet("default");
    }

    Car(String company, int speed) {
        this.company = company;
        this.speed = speed;
        sheet = new Sheet("cool");
    }

    public boolean isStop() {
        return stop;
    }

    public void setStop(boolean stop) {
        this.stop = stop;
    }

    public String getModel() {
        return version + "." + model;
    }

    public void setSpeed(int speed) {
        if (speed < 0) {
            this.speed = 0;
        } else {
            this.speed = speed;
        }
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
