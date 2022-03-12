import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CurrencyTest {

    public static Currency Currency;
    @BeforeClass
    public static void setup(){
        Currency = new Currency();
    }
    @Test
    public void testdollar(){
        assertEquals(3, Currency.dollar(156));
    }

    @Test
    public void testeuro(){
        assertEquals(2, Currency.euro(172));
    }

    @Test
    public void testpound(){
        assertEquals(2, Currency.pound(204));
    }
}
