import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;


@RunWith(JUnitParamsRunner.class)

public class CalculatorTest{

    @Test
    @Parameters(method="calcValues")
    public void calculate(BigDecimal UNIT_PRICE, int numberOfMessages, BigDecimal expectedValue){
        CostCalculator calc = new CostCalculator(UNIT_PRICE);
        assertEquals(expectedValue,calc.calculate(numberOfMessages));
    }

    private Object[] calcValues(){ //!private
        return new Object[]{
                new Object[]{new BigDecimal("0.2"),100,new BigDecimal("20.0")},
                new Object[]{new BigDecimal("0.2"),10,new BigDecimal("2.0")},
                new Object[]{new BigDecimal("0.2"),0,new BigDecimal("0.0")},
        };
    }
}
