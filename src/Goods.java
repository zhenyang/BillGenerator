import java.util.ArrayList;

public class Goods {

    private ArrayList<Good> goods;

    public Goods(String shoppingList) {
        goods = new ArrayList<Good>();
        for (String name : parseNames(shoppingList)) {
            goods.add(GoodFactory.create(name));
        }
    }

    public Goods() {
        goods = new ArrayList<Good>();
    }

    private ArrayList<String> parseNames(String shoppingList) {
        ArrayList<String> names = new ArrayList<String>();
        char[] chars = shoppingList.toCharArray();
        for (char aChar : chars) {
            names.add(String.valueOf(aChar));
        }
        return names;
    }

    public int getPrice() {
        int totalPrice = 0;
        for (Good good : goods) {
            totalPrice += good.getPrice();
        }
        return totalPrice;
    }

    public void addGood(Good good) {
        goods.add(good);
    }

    public int count(Good goodNeedToCount) {
        int count = 0;
        for (Good good : goods) {
            if (good.equals(goodNeedToCount)) {
                count++;
            }
        }
        return count;
    }

    public Goods copy() {
        Goods copied = new Goods();
        copied.goods = (ArrayList<Good>) goods.clone();
        return copied;
    }
}
