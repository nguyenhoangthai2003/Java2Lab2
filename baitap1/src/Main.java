import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("SV01", "Nguyen Van An", StudentType.REGULAR));
        students.add(new Student("SV02", "Tran Thi Binh", StudentType.PART_TIME));
        students.add(new Student("SV03", "John Smith", StudentType.INTERNATIONAL));
        students.add(new Student("SV04", "Le Minh Chau", StudentType.REGULAR));
        students.add(new Student("SV05", "Pham Quoc Dung", StudentType.PART_TIME));
        students.add(new Student("SV06", "Akiko Tanaka", StudentType.INTERNATIONAL));
        students.add(new Student("SV07", "Hoang Thu Ha", StudentType.REGULAR));
        System.out.println(" DANH SACH TOAN BO SINH VIEN ");
        for (Student s : students) {
            System.out.println(s);
        }

        System.out.println("\nDANH SACH THEO TUNG LOAI");
        for (StudentType type : StudentType.values()) {
            System.out.println("--- " + type + " (" + type.getDescription() + ") ---");
            for (Student s : students) {
                if (s.getType() == type) {
                    System.out.println(s);
                }
            }
        }

        System.out.println("\nSO LUONG THEO TUNG LOAI");
        for (StudentType type : StudentType.values()) {
            int count = 0;
            for (Student s : students) {
                if (s.getType() == type) {
                    count++;
                }
            }
            System.out.println(type + ": " + count);
        }
    }
}
