import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        service.add(new Employee("NV01", "Nguyen Van An", 12000000));
        service.add(new Employee("NV02", "Tran Thi Binh", 15000000));
        service.add(new Employee("NV03", "Le Minh Chau", 9000000));

        int choice;
        do {
            System.out.println("\nQuan ly nhan vien");
            System.out.println("1. Them nhan vien");
            System.out.println("2. Hien thi danh sach");
            System.out.println("3. Tim nhan vien theo ma");
            System.out.println("4. Cap nhat luong theo ma");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");

            try {
                choice = Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException ex) {
                System.out.println("Vui long nhap so!");
                choice = -1;
                continue;
            }

            try {
                switch (choice) {
                    case 1 ->{
                        System.out.print("Ma: ");
                        String id = sc.nextLine().trim();
                        System.out.print("Ten: ");
                        String name = sc.nextLine().trim();
                        System.out.print("Luong: ");
                        double salary = Double.parseDouble(sc.nextLine().trim());
                        boolean ok = service.add(new Employee(id, name, salary));
                        System.out.println(ok ? "Them thanh cong." : "Them that bai (ma rong or da ton tai).");
                    }
                    case 2 -> service.displayAll();
                    case 3 -> {
                        System.out.print("Nhap ma can tim: ");
                        Employee e = service.findById(sc.nextLine().trim());
                        System.out.println(e != null ? e : "Khong tim thay nhan vien.");
                    }
                    case 4  ->{
                        System.out.print("Nhap ma nhan vien: ");
                        String id = sc.nextLine().trim();
                        System.out.print("Luong moi: ");
                        double salary = Double.parseDouble(sc.nextLine().trim());
                        System.out.println(service.updateSalary(id, salary)
                                ? "Cap nhat thang cong." : "Khong tim thay nhan vien.");
                    }
                    case 0 -> System.out.println("Tam biet!");
                    default -> System.out.println("Lua chon khong hop le!");
                }
            } catch (NumberFormatException ex) {
                System.out.println("Loi: Luong phai la so.");
            } catch (IllegalArgumentException ex) {
                System.out.println("Loi: " + ex.getMessage());
            }
        } while (choice != 0);

        sc.close();
    }
}
