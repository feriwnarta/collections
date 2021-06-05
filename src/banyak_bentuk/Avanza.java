package banyak_bentuk;

public class Avanza implements Car{
    @Override
    public void startEngine() {
        System.out.println("start engine dari avanza");
    }

    @Override
    public void stopEngine() {
        System.out.println("stop engine dari avanza");
    }

    @Override
    public void brake() {
        System.out.println("brake dari avanza");
    }
}
