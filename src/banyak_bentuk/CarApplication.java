package banyak_bentuk;

public class CarApplication {
    public static void main(String[] args) {

        Car car1 = new Bmw();

        car1.startEngine();
        car1.brake();
        car1.stopEngine();

        Car car2 = new Avanza();
        car2.startEngine();
        car2.brake();
        car2.stopEngine();

    }
}
