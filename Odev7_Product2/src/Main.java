public class Main {
    public static void main(String[] args) {
        Sellable apple = new Product("Apple", 3.5, new Location("Depo A", "Raf 2"));
        Sellable laptop = new UsedEquipment("Eski Laptop", 1500);
        Sellable training = new ConsultingService("Java Eğitimi", 3500);
        Sellable penGift = new GiftProduct("Tükenmez Kalem", 25);

        Sellable[] items = { apple, laptop, training, penGift };

        for (Sellable item : items) {
            item.displayInfo();
            System.out.println("Satış fiyatı: " + item.getPrice() + "₺");
            System.out.println("--------------");
        }
    }
}