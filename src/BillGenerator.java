import java.util.ArrayList;

public class BillGenerator {

    private Parser parser;

    public BillGenerator() {
        parser = new Parser();
    }

    public int calculateBill(String shoppingList) {
        ArrayList<Good> goods = parser.parseGoods(shoppingList);
        return totalPrice(goods);
    }

    private int totalPrice(ArrayList<Good> goods) {
        int totalPrice = 0;
        for (Good good : goods) {
            totalPrice += good.getPrice();
        }
        return totalPrice;
    }
}
