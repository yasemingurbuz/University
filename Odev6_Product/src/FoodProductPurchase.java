public class FoodProductPurchase {
    public void purchase(FoodProduct product) {
        System.out.println("Purchased food product: " + product.name);
        product.displayInfo();
    }
}
