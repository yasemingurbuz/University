public class ClothProduct extends Product {
    private String sex;   // e.g., male/female/unisex
    private String size;  // e.g., S, M, L

    public ClothProduct(String name, double price, Location location, String sex, String size) {
        super(name, price, location);
        this.sex = sex;
        this.size = size;
    }

    public String getSex() {
        return sex;
    }

    public String getSize() {
        return size;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Sex: " + sex);
        System.out.println("Size: " + size);
    }
}
