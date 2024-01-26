package chapter08;

public class Driver {
    public void drive(Vehicle vehicle) {
        if (vehicle instanceof Bus) {
            System.out.println("Bus//");
        }

        if (vehicle instanceof Taxi) {
            System.out.println("Taxi//");
        }

        vehicle.run();
    }
}
