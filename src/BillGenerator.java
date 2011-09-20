import java.util.ArrayList;

public class BillGenerator {

    public BillGenerator() {
    }

    public int calculateBill(String shoppingList) {
        ArrayList<DiscountRule> discounts = prepareDiscountRoles();
        Clerk clerk = new Clerk(discounts);
        return clerk.discount(new Goods(shoppingList)).getPrice();
    }

    private ArrayList<DiscountRule> prepareDiscountRoles() {
        DiscountRule ruleForA = new DiscountRule("A", 3, -20);
        DiscountRule ruleForB = new DiscountRule("B", 2, -15);
        ArrayList<DiscountRule> discounts = new ArrayList<DiscountRule>();
        discounts.add(ruleForA);
        discounts.add(ruleForB);
        return discounts;
    }
}
