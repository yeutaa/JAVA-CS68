package week6;

public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public void startEngine() {
        System.out.println(brand + ": Engine started.");
    }

    public void stopEngine() {
        System.out.println(brand + ": Engine stopped.");
    }
}