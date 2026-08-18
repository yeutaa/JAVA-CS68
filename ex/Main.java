public class Main {
    public static void main(String[] args) {
        System.out.println("==========TRAVEL INFORMATION==========");
        System.out.println();

        Car car = new Car("Toyota", "Car", "Toyota");
        car.displayInfo();
        car.start();
        car.travel();

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        Train train = new Train("SRT Train", "Train", "SRT Train");
        train.displayInfo();
        train.start();
        train.travel();

        System.out.println();
        System.out.println("-------------------------");
        System.out.println();

        Airplane airplane = new Airplane("Thai Airways", "Airplane", "Thai Airways");
        airplane.displayInfo();
        airplane.start();
        airplane.travel();

        System.out.println();
        System.out.println("==========FLYING VEHICLES==========");
        System.out.println();
        airplane.fly();
    }
}