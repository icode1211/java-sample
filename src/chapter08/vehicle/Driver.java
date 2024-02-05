package chapter08.vehicle;

public class Driver {
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            System.out.println("버스!");
        } else if (vehicle instanceof Taxi) {
            System.out.println("택시!");
        }
        vehicle.run();
    }
}
