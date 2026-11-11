public class Employee {
    private String id;
    private String name;
    private double salary;

    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        setSalary(salary);
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Luong khong duoc am: " + salary);
        }
        this.salary = salary;
    }

    @Override
public String toString() {
    return String.format("| %-8s | %-22s | %-12.0f |", id, name, salary);
}
}
