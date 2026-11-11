public enum ProductCategory {
    FOOD("Thuc pham"),
    ELECTRONIC("Dien tu"),
    CLOTHING("Quan ao");

    private final String displayName;

    ProductCategory(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
