public class UsedEquipment implements Sellable {
    private String name;
    private double price;

    public UsedEquipment(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void displayInfo() {
        System.out.println("Used Equipment: " + name + " | Price: " + price);
    }
}
