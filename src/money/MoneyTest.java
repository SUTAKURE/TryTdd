package money;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MoneyTest {
    @Test
    public void testMultipication() {
        final Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.ammount);
    }
}

