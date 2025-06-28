public class ConsultingService implements Sellable {
    private String name;
    private double price;

    public ConsultingService(String name, double price) {
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
        System.out.println("Service: " + name + " | Price: " + price);
    }
}
