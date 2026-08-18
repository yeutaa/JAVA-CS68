class Airplane extends Vehicle implements Flyable {
    private String airline;

    public Airplane(String name, String type, String airline) {
        super(name, type);
        this.airline = airline;
    }

    @Override
    public void start() {
        System.out.println("Action : " + airline + " is starting.");
    }

    @Override
    public void travel() {
        System.out.println("Action : " + airline + " is flying in the air.");
    }

    @Override
    public void fly() {
        System.out.println(airline + " can fly.");
    }
}