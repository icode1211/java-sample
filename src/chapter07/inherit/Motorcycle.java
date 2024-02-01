package chapter07.inherit;

public class Motorcycle extends Vehicle {

    void setSpeed(int speed) {
        this.speed = speed;
    }
    public void print() {
        System.out.println("Child(Motorcycle):" + model + "," + speed + "," + stop);
    }
}
