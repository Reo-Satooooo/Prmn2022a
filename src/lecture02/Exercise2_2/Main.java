package lecture02.Exercise2_2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        GasStation gasStation = new GasStation();

        car.run();
        gasStation.refuel(car);
        car.run();
    }
}
