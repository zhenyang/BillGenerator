public class DiscountRule {

    private int count;
    private int priceOff;
    private String name;

    public DiscountRule(String name, int count, int priceOff) {
        this.count = count;
        this.priceOff = priceOff;
        this.name = name;
    }

    public Goods discount(Goods goods) {
        Goods afterDiscount = goods.copy();
        int occurrence = afterDiscount.occurrenceOf(new GoodFactory().createGood(name));
        for (int i = 0; i < occurrence / count; i++) {
            afterDiscount.add(new Good(priceOff));
        }
        return afterDiscount;
    }
}
