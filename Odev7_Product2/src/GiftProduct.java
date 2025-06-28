public class GiftProduct implements Sellable {
    private String name;
    private double price; // normal fiyatı ama ücretsiz veriliyor

    public GiftProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return 0.0; // Hediye olduğu için satış fiyatı 0
    }

    public void displayInfo() {
        System.out.println("🎁 Gift Product: " + name + " | Market Price: " + price + " | Given as gift");
    }
}
