public class Product implements Sellable {
    protected String name;
    protected double price;
    protected Location location;

    public Product(String name, double price, Location location) {
        this.name = name;
        this.price = price;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Product: " + name + " | Price: " + price);
        if (location != null) {
            System.out.println("Location: " + location.getDepot() + " - " + location.getPlace());
        }
    }
}
