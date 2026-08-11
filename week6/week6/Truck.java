package week6;

public class Truck extends Vehicle {

    public Truck(String brand) {
        super(brand);
    }

    @Override
    public void startEngine() {
        System.out.println(brand + ": Truck Engine Started");
    }

    public void f18ton() {
        System.out.println(brand + ": ต่อพ่วงหลังบันทุกได้18ตัน");
    }
}