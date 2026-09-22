
public class Student {

    // Attributes
    private String id;
    private String name;
    private double gpa;

    // Constructor
    public Student(String id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    // Method แสดงข้อมูลนักศึกษา
    public void showInfo() {
        System.out.println(
            "ID: " + id +
            " | Name: " + name +
            " | GPA: " + gpa
        );
    }

    // Getter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Setter สำหรับ Challenge
    public void setName(String name) {
        this.name = name;
    }
}