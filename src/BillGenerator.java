public class BillGenerator {

    public BillGenerator() {
    }

    public int calculateBill(String shoppingList) {
        Goods goods = new Goods(shoppingList);
        Goods goodsAfterDiscount = new Clerk().discount(goods);
        return goodsAfterDiscount.getPrice();
    }
}
