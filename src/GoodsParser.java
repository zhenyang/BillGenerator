import java.util.ArrayList;
import java.util.List;

public class GoodsParser {
    public List<Good> generateGoods(String shoppingList) {
        List<String> names = parseNames(shoppingList);
        List<Good> goods = new ArrayList<Good>();
        for (String name : names) {
            goods.add(new GoodFactory().createGood(name));
        }
        return goods;
    }

    private List<String> parseNames(String shoppingList) {
        List<String> names = new ArrayList<String>();
        for (char name : shoppingList.toCharArray()) {
            names.add(String.valueOf(name));
        }
        return names;
    }
}
