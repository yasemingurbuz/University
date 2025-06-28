public class Product {
    protected String name;
    protected double price;
    protected Location location;

    public Product(String name, double price, Location location) {
        this.name = name;
        this.price = price;
        this.location = location;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Location: " + location.getDepot() + " - " + location.getPlace());
    }
}
