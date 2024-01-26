package chapter08;

public class DriverExample {
    public static void main(String[] args) {
        Driver driver = new Driver();
        Vehicle taxi = new Taxi();
        driver.drive(taxi);     // 전달한 구현 객체로 자동 타입 변환 : Vehicle vehicle = taxi;

        Vehicle bus = new Bus();
        driver.drive(bus);      // 전달한 구현 객체로 자동 타입 변환 : Vehicle vehicle = bus;
    }
}
