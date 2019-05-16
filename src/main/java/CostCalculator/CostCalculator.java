package CostCalculator;

import java.math.BigDecimal;
import java.math.MathContext;

public class CostCalculator {

    private static BigDecimal UNIT_PRICE = BigDecimal.valueOf(0.2);

    public CostCalculator(BigDecimal unitPrice) {
          UNIT_PRICE = unitPrice;
    }

    public BigDecimal calculate(int pieces){

        MathContext mathContext = new MathContext(3);
        return BigDecimal.valueOf(pieces).multiply(UNIT_PRICE).round(mathContext);
    }

}
