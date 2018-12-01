import java.math.BigDecimal;

public class CostCalculator {

    private static BigDecimal UNIT_PRICE = BigDecimal.valueOf(2.0); //final zainicjalizowna od razu albo w konstrukorze
    double finalCost;

    CostCalculator(BigDecimal unitPrice) {
          UNIT_PRICE = unitPrice;
    }

    public BigDecimal calculate(int pieces){
        return BigDecimal.valueOf(pieces).multiply(UNIT_PRICE);
    }
}
