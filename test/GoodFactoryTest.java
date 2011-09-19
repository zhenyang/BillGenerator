import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class GoodFactoryTest {
    @Test
    public void should_create_good_by_name() throws Exception {
        GoodFactory goodFactory = new GoodFactory();
        assertThat(goodFactory.createGoodByName("A").getPrice(), equalTo(50));
        assertThat(goodFactory.createGoodByName("B").getPrice(), equalTo(30));
        assertThat(goodFactory.createGoodByName("C").getPrice(), equalTo(20));
        assertThat(goodFactory.createGoodByName("D").getPrice(), equalTo(15));
    }
}
