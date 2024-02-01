package chapter07.inherit;

public class Car extends Vehicle {

    public void print() {
        System.out.println("Child(Car):" + model + "," + speed + "," + stop);
    }
}
