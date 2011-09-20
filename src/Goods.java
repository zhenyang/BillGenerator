import java.util.ArrayList;
import java.util.List;

public class Goods {
    private List<Good> goods;

    public Goods(String shoppingList) {
        goods = new ArrayList<Good>();

        List<String> names = new ShoppingList(shoppingList).toList();
        for (String name : names) {
            goods.add(create(name));
        }
    }

    private Good create(String name) {
        if (name.equals("A")) {
            return new Good("A", 50);
        }
        if (name.equals("B")) {
            return new Good("B", 30);
        }
        if (name.equals("C")) {
            return new Good("C", 20);
        }
        return new Good("D", 15);
    }

    public int getPrice() {
        int total = 0;
        for (Good good : goods) {
            total += good.getPrice();
        }
        return total;
    }

    public int countSpecificGood(String name) {
        int count=0;
        for (Good good : goods) {
            if(good.getName().equals(name)){
                count++;
            }
        }
        return count;
    }

    public void addGood(String name, int price) {
        goods.add(new Good(name, price));
    }
}
