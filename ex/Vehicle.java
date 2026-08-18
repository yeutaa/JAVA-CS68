abstract class Vehicle {
    protected String name;
    protected String type;

    public Vehicle(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public void displayInfo() {
        System.out.println("Name : " + name);
        System.out.println("Type : " + type);
        System.out.println();
    }

    public abstract void start();
    public abstract void travel();
}
