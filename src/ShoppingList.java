import java.util.ArrayList;
import java.util.List;

public class ShoppingList {
    private List<String> names;

    public ShoppingList(String shoppingList) {
        names = new ArrayList<String>();
        char[] nameArray = shoppingList.toCharArray();
        for (char name : nameArray) {
            names.add(String.valueOf(name));
        }
    }

    public List<String> toList() {
        return names;
    }
}
