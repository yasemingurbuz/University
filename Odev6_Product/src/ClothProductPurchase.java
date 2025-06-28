public class ClothProductPurchase {
    public void purchase(ClothProduct product) {
        System.out.println("Purchased cloth product: " + product.name);
        product.displayInfo();
    }
}
