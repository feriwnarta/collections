package banyak_bentuk;

public class Bmw implements Car{
    @Override
    public void startEngine() {
        System.out.println("Start Engine dari bmw");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop engine dari bmw");
    }

    @Override
    public void brake() {
        System.out.println("Brake dari bmw");
    }
}
