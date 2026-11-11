public enum StudentType {
    REGULAR("Sinh vien chinh quy"),
    PART_TIME("Sinh vien vua hoc vua lam"),
    INTERNATIONAL("Sinh vien quoc te");

    private final String description;

    StudentType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
