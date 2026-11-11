import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private final List<Employee> employees = new ArrayList<>();

    public boolean add(Employee e) {
        if (e == null || e.getId() == null || e.getId().isBlank()) {
            return false;
        }
        if (findById(e.getId()) != null) {
            return false; 
        }
        employees.add(e);
        return true;
    }

    public void displayAll() {
        if (employees.isEmpty()) {
            System.out.println("Danh sach nhan vien dang trong.");
            return;
        }
        System.out.printf("| %-8s | %-22s | %-12s |\n", "Ma NV", "Ho va ten", "Luong");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
    public Employee findById(String id) {
        for (Employee e : employees) {
            if (e.getId().equalsIgnoreCase(id)) {
                return e;
            }
        }
        return null;
    }

    public boolean updateSalary(String id, double newSalary) {
        Employee e = findById(id);
        if (e == null) {
            return false;
        }
        e.setSalary(newSalary); 
        return true;
    }
}