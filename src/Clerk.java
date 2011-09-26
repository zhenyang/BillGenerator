import java.util.ArrayList;
import java.util.List;

public class Clerk {
    List<DiscountRule> rules;

    public Clerk() {
        rules = new ArrayList<DiscountRule>();
        rules.add(new DiscountRule("A", 3, -20));
        rules.add(new DiscountRule("B", 2, -15));
    }

    public Goods discount(Goods goods) {
        Goods result = goods.copy();
        for (DiscountRule rule : rules) {
            result = rule.discount(result);
        }
        return result;
    }
}
