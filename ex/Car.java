class Car extends Vehicle {
    private String brand;

    public Car(String name, String type, String brand) {
        super(name, type);
        this.brand = brand;
    }

    @Override
    public void start() {
        System.out.println("Action : " + brand + " is starting.");
    }

    @Override
    public void travel() {
        System.out.println("Action : " + brand + " is traveling on the road.");
    }
}