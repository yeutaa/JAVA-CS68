package week6;

public class Car extends Vehicle {

    public Car(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + ": Car Engine started.");
    }

    @Override
    public void stopEngine() {
        System.out.println(brand + ": Car Engine stopped.");
    }

    public void TurnLeft() {
        System.out.println(brand + ": Turn left");
    }

    public void TurnRight() {
        System.out.println(brand + ": Turn right");
    }
}