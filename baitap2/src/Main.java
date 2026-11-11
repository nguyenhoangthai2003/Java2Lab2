import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("P01", "Banh mi", 15000, ProductCategory.FOOD));
        products.add(new Product("P02", "Sua tuoi", 32000, ProductCategory.FOOD));
        products.add(new Product("P03", "Gao ST25 5kg", 120000, ProductCategory.FOOD));
        products.add(new Product("P04", "Dien thoại", 8500000, ProductCategory.ELECTRONIC));
        products.add(new Product("P05", "Tai nghe", 450000, ProductCategory.ELECTRONIC));
        products.add(new Product("P06", "Laptop", 15000000, ProductCategory.ELECTRONIC));
        products.add(new Product("P07", "Ao thun", 150000, ProductCategory.CLOTHING));
        products.add(new Product("P08", "Quan jean", 350000, ProductCategory.CLOTHING));
        products.add(new Product("P09", "Ao khoac", 500000, ProductCategory.CLOTHING));

        Map<ProductCategory, Integer> countMap = new HashMap<>();
        Map<ProductCategory, Double> totalMap = new HashMap<>();

        for (Product p : products) {
            countMap.put(p.getCategory(), countMap.getOrDefault(p.getCategory(), 0) + 1);
            totalMap.put(p.getCategory(), totalMap.getOrDefault(p.getCategory(), 0.0) + p.getPrice());
        }

        System.out.println("DANH SACH SAN PHAM");
        System.out.printf("| %-8s | %-22s | %-12s | %-20s |\n", "Ma SP", "Ten san pham", "Gia", "Danh muc");
        for (Product p : products) {
            System.out.println(p);
        }

        System.out.println("\nSO LUONG SAN PHAM THEO LOAI");
        for (Map.Entry<ProductCategory, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + " (" + entry.getKey().getDisplayName() + "): "
                    + entry.getValue());
        }

        System.out.println("\nTONG GIA TRI THEO LOAI");
        for (Map.Entry<ProductCategory, Double> entry : totalMap.entrySet()) {
            System.out.printf("%s (%s): %,.0f VND%n",
                    entry.getKey(), entry.getKey().getDisplayName(), entry.getValue());
        }
    }
}
