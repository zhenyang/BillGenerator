import java.util.List;

public class Goods {
    private List<Good> goods;
    private GoodsParser goodsParser;

    public Goods(String shoppingList) {
        goodsParser = new GoodsParser();
        goods = goodsParser.generateGoods(shoppingList);
    }

    public Goods(List<Good> goods) {
        this.goods = goods;
    }

    public int getTotalPrice() {
        int result = 0;
        for (Good good : goods) {
            result += good.getPrice();
        }
        return result;
    }

    public Goods copy() {
        return new Goods(this.goods);
    }

    public void add(Good good) {
        goods.add(good);
    }

    public int occurrenceOf(Good goodNeedToCount) {
        int occurrence = 0;
        for (Good good : goods) {
            if (good.equals(goodNeedToCount)) {
                occurrence++;
            }
        }
        return occurrence;
    }
}
