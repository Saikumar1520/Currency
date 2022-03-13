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
        assertEquals(2, Currency.dollar(156));
    }

    @Test
    public void testeuro(){
        assertEquals(2, Currency.euro(172));
    }

    @Test
    public void testpound(){
        assertEquals(2, Currency.pound(204));
    }

    @Test
    public void testsek(){
        assertEquals(2, Currency.sek(16));
    }


    @Test
    public void testcnd(){
        assertEquals(2, Currency.cnd(160));
    }
}
