class Train extends Vehicle {
    private String trainName;

    public Train(String name, String type, String trainName) {
        super(name, type);
        this.trainName = trainName;
    }

    @Override
    public void start() {
        System.out.println("Action : " + trainName + " is starting.");
    }

    @Override
    public void travel() {
        System.out.println("Action : " + trainName + " is traveling on the raillway.");
    }
}