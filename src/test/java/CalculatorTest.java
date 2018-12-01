import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

public class CalculatorTest extends TestCase {

    private CostCalculator costCalculator;
    BigDecimal UNIT_PRICE = BigDecimal.valueOf(2.0);

    @Before
    public void setUpCalculator() {
        costCalculator = new CostCalculator(UNIT_PRICE);
    }

    @Test
    public void calculate(){
        assertEquals(costCalculator.calculate(5),10.0);
    }

    @Test
    public void calculateEmptySms(){
        assertEquals(costCalculator.calculate(0),0);
    }
}
