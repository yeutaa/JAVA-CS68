import java.util.ArrayList;

public class StudentManager {

    // สร้าง ArrayList สำหรับเก็บ Student
    private ArrayList<Student> students;

    // Constructor
    public StudentManager() {
        students = new ArrayList<>();
    }

    // เพิ่มนักศึกษา
    public void addStudent(Student student) {
        students.add(student);
    }

    // แสดงนักศึกษาทั้งหมด
    public void showAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            s.showInfo();
        }
    }

    // ค้นหานักศึกษาจาก ID
    public Student findStudentById(String id) {

        for (Student s : students) {

            if (s.getId().equals(id)) {
                return s;
            }
        }

        return null;
    }

    // ลบนักศึกษาจาก ID
    public boolean removeStudentById(String id) {

        Student student = findStudentById(id);

        if (student != null) {
            students.remove(student);
            return true;
        }

        return false;
    }

    // =========================
    // Challenge 1
    // อัปเดตชื่อ Student
    // =========================
    public boolean updateStudentName(String id, String newName) {

        Student student = findStudentById(id);

        if (student != null) {
            student.setName(newName);
            return true;
        }

        return false;
    }

    // =========================
    // Challenge 2
    // นับจำนวน Student
    // =========================
    public int countStudents() {
        return students.size();
    }
}