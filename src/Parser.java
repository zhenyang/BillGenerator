import java.util.ArrayList;

public class Parser {
    private GoodFactory goodFactory;

    public Parser() {
        goodFactory = new GoodFactory();
    }

    public ArrayList<Good> parseGoods(String shoppingList) {
        ArrayList<Good> goods = new ArrayList<Good>();
        char[] goodNames = shoppingList.toCharArray();
        for (char goodName : goodNames) {
            updateGoodsByName(goods, String.valueOf(goodName));
        }
        return goods;
    }


    private void updateGoodsByName(ArrayList<Good> goods, String name) {
        boolean updated = false;
        for (Good good : goods) {
            if (good.getName().equals(name)) {
                good.addCount();
                updated = true;
            }
        }
        if (!updated) {
            goods.add(goodFactory.createGoodByName(name));
        }
    }
}
