package lecture02.Exercise2_3;

public class Car {
    int fuel;
    Tire[] tires;
    Engine engine;

//    Engine engine = new Engine(4000);

    Car(Tire[]tires,Engine engine){
        this.tires = tires;
        this.engine = engine;
        this.fuel = 0;
    }

    public void run(){
        if (this.fuel == 0){
            System.out.println("燃料が足りないため走れませんでした。");
        } else {
            this.fuel = fuel - 1;
            System.out.println("燃料を1消費して走りました");
        }
    }

    public void startEngine(){
        engine.start();
    }
}
