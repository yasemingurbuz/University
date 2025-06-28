import java.util.Date;

public class FoodProduct extends Product {
    private Date productionDate;
    private int life; // shelf life in days

    public FoodProduct(String name, double price, Location location, Date productionDate, int life) {
        super(name, price, location);
        this.productionDate = productionDate;
        this.life = life;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public int getLife() {
        return life;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Production Date: " + productionDate);
        System.out.println("Life: " + life + " days");
    }
}
