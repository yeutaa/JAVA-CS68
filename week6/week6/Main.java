package week6;

public class Main {

    public static void main(String[] args) {
        Car v1 = new Car("BMW");
        Motorcycle v2 = new Motorcycle("Yamaha");
        Truck v3 = new Truck("Honda");

        v1.startEngine();
        v1.TurnLeft();
        v1.TurnRight();
        System.out.println("----------------------");

        v2.startEngine();
        v2.fireEx();
        v2.twoWheels();
        System.out.println("----------------------");

        v3.startEngine();
        v3.f18ton();

        System.out.println("----------------------");

        v2.stopEngine();
        v1.stopEngine();
    }
}