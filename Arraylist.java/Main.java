public class Main {

    public static void main(String[] args) {

        StudentManager manager = new StudentManager();

        // =================================
        // เพิ่มนักศึกษา 5 คน
        // =================================
        manager.addStudent(
            new Student("001", "Somchai", 3.25)
        );

        manager.addStudent(
            new Student("002", "Somsri", 3.75)
        );

        manager.addStudent(
            new Student("003", "Anan", 2.80)
        );

        manager.addStudent(
            new Student("004", "Suda", 3.50)
        );

        manager.addStudent(
            new Student("005", "Krit", 2.95)
        );


        // =================================
        // แสดงนักศึกษาทั้งหมด
        // =================================
        System.out.println("=== ALL STUDENTS ===");

        manager.showAllStudents();


        // =================================
        // ค้นหานักศึกษาที่มีอยู่
        // =================================
        System.out.println("\n=== SEARCH ===");

        Student student = manager.findStudentById("002");

        if (student != null) {
            student.showInfo();
        } else {
            System.out.println("Student not found.");
        }


        // =================================
        // ลบนักศึกษา 1 คน
        // =================================
        System.out.println("\n=== REMOVE ===");

        if (manager.removeStudentById("002")) {
            System.out.println("Student ID 002 removed.");
        } else {
            System.out.println("Student not found.");
        }


        // =================================
        // แสดงข้อมูลหลังจากลบ
        // =================================
        System.out.println("\n=== AFTER REMOVE ===");

        manager.showAllStudents();


        // =================================
        // Challenge 1
        // เปลี่ยนชื่อ Student
        // =================================
        System.out.println("\n=== UPDATE NAME ===");

        if (manager.updateStudentName("003", "Anan Updated")) {
            System.out.println("Update successful.");
        } else {
            System.out.println("Student not found.");
        }

        manager.showAllStudents();


        // =================================
        // Challenge 2
        // นับจำนวน Student
        // =================================
        System.out.println("\n=== COUNT STUDENTS ===");

        System.out.println(
            "Number of students: " + manager.countStudents()
        );
    }
}