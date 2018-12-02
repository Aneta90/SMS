import junit.framework.TestCase;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.math.BigDecimal;

@RunWith(JUnitParamsRunner.class)

public class CalculatorTest extends TestCase {

    @Test
    @Parameters(method="calcValues")
    public void calculate(BigDecimal unitCost, int numberOfMessages, BigDecimal expectedValue){
        CostCalculator calc = new CostCalculator(unitCost);
        assertEquals(expectedValue,calc.calculate(numberOfMessages));
    }

    private Object[] calcValues(){ //!private
        return new Object[]{
                new Object[]{new BigDecimal(0),100,new BigDecimal(0)},
                new Object[]{new BigDecimal(0.3),10,new BigDecimal(3)},
                new Object[]{new BigDecimal(0.3),0,new BigDecimal(0)},
        };
    }
}
