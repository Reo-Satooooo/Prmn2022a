package lecture02.Exercise2_2;

public class Car {
    int fuel;

    Car(){
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
}
