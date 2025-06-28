import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Location loc1 = new Location("Depot A", "Shelf 3");
        Location loc2 = new Location("Depot B", "Rack 5");

        FoodProduct apple = new FoodProduct("Apple", 3.5, loc1, new Date(), 10);
        ClothProduct tshirt = new ClothProduct("T-Shirt", 49.99, loc2, "Unisex", "M");

        FoodProductPurchase foodPurchase = new FoodProductPurchase();
        ClothProductPurchase clothPurchase = new ClothProductPurchase();

        foodPurchase.purchase(apple);
        System.out.println("------------------");
        clothPurchase.purchase(tshirt);
    }
}