import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class BillGeneratorTest {

    private BillGenerator billGenerator;
    private static final String EMPTY_SHOPPING_LIST = "";
    private static final String SHOPPING_LIST_A = "A";
    private static final String SHOPPING_LIST_AB = "AB";
    private static final String SHOPPING_LIST_ABCD = "ABCD";
    private static final String SHOPPING_LIST_AAA = "AAA";

    @Before
    public void setUp() throws Exception {
        billGenerator = new BillGenerator();

    }

    @Test
    public void should_equal_zero_when_shopping_list_is_empty() throws Exception {
        assertThat(billGenerator.calculateBill(EMPTY_SHOPPING_LIST), equalTo(0));
    }

    @Test
    public void should_calculate_price_when_shopping_list_has_only_one_good() throws Exception {
        assertThat(billGenerator.calculateBill(SHOPPING_LIST_A), equalTo(50));
    }

    @Test
    public void should_calculate_price_when_shopping_list_has_two_different_goods() throws Exception {
        assertThat(billGenerator.calculateBill(SHOPPING_LIST_AB), equalTo(80));
    }

    @Test
    public void should_calculate_price_when_shopping_list_has_four_different_goods() throws Exception {
        assertThat(billGenerator.calculateBill(SHOPPING_LIST_ABCD), equalTo(115));
    }

    @Test
    public void should_calculate_price_when_shopping_list_has_three_same_goods() throws Exception {
        assertThat(billGenerator.calculateBill(SHOPPING_LIST_AAA), equalTo(130));
    }

    @Test
    public void should_calculate_price_when_shopping_list_has_four_same_goods() throws Exception {
        assertThat(billGenerator.calculateBill("AAAAAA"), equalTo(260));
    }

    @Test
    public void should_calculate_price_when_shopping_list_has_two_same_goods_b() throws Exception {
        assertThat(billGenerator.calculateBill("BB"), equalTo(45));
    }

    @Test
    public void should_return_190_given_buy_AAABBD() throws Exception {
        assertThat(billGenerator.calculateBill("ABABAD"), equalTo(190));
    }
}
