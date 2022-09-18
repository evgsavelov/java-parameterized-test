public class ShoppingCart {
    private final Item[] items;

    public ShoppingCart(Item[] items) {
        this.items = items;
    }

    public int getTotalPrice() {
        int totalAmount = 0;

        for (Item item : items) {
            totalAmount += item.getAmount();
        }
        if(totalAmount > 10){
            return 1000;
        }
        return totalAmount * 2;
    }
}
