import java.util.ArrayList;

public class Clerk {
    private ArrayList<DiscountRule> rules;

    public Clerk(ArrayList<DiscountRule> rules) {
        this.rules = rules;
    }

    public Goods discount(Goods goods) {
        for (DiscountRule rule : rules) {
            int count = goods.countSpecificGood(rule.getName());
            if (count >= rule.getCount()) {
                for (int i = 0; i < count / rule.getCount(); i++) {
                    goods.addGood("discountOf" + rule.getName(), rule.getOff());
                }
            }
        }
        return goods;
    }
}
