package lecture02.Exercise2_3;

public class Main {
    public static void main(String[] args) {
        Tire tire = new Tire(65);
        Tire[] tires = {tire,tire,tire,tire};
        Engine engine = new Engine(4000);
        Car car = new Car(tires,engine);
        GasStation gasStation = new GasStation();

        gasStation.refuel(car);
        car.startEngine();
        car.run();
    }
}
