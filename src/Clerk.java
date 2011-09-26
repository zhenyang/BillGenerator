import java.util.ArrayList;

public class Clerk {

    private ArrayList<DiscountRule> discountRules;

    public Clerk() {
        discountRules = new ArrayList<DiscountRule>();
        discountRules.add(new DiscountRule("A", 3, -20));
        discountRules.add(new DiscountRule("B", 2, -15));
    }

    public Goods discount(Goods goods) {
        Goods goodsAfterDiscount = goods.copy();
        for (DiscountRule rule : discountRules) {
            goodsAfterDiscount = discountGoodsByRule(goodsAfterDiscount, rule);
        }
        return goodsAfterDiscount;
    }

    private Goods discountGoodsByRule(Goods goods, DiscountRule rule) {
        Goods result = goods.copy();
        int count = result.count(GoodFactory.create(rule.getName()));
        for (int i = 0; i < count / rule.getCount(); i++) {
            result.addGood(new Good(rule.getPriceOff()));
        }
        return result;
    }

    private class DiscountRule {
        private String name;
        private int count;
        private int priceOff;

        public DiscountRule(String name, int count, int priceOff) {
            this.name = name;
            this.count = count;
            this.priceOff = priceOff;
        }

        public int getPriceOff() {
            return priceOff;
        }

        public int getCount() {
            return count;
        }

        public String getName() {
            return name;
        }
    }
}
