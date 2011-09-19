import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class ParserTest {

    private Parser parser;

    @Before
    public void setUp() throws Exception {
        parser = new Parser();
    }

    @Test
    public void should_parse_shopping_list() throws Exception {
        ArrayList<Good> goods = parser.parseGoods("ABCD");
        assertThat(goods.get(0).getName(),equalTo("A"));
        assertThat(goods.get(1).getName(),equalTo("B"));
        assertThat(goods.get(2).getName(),equalTo("C"));
        assertThat(goods.get(3).getName(),equalTo("D"));
    }

    @Test
    public void should_parse_two_same_goods_to_one_good_which_count_equals_two() throws Exception {
        ArrayList<Good> goods = parser.parseGoods("AA");
        assertThat(goods.size(),equalTo(1));
        assertThat(goods.get(0).getCount(),equalTo(2));
    }
}
