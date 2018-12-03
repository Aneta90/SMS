import java.math.BigDecimal;

public class CostCalculator {

    private static BigDecimal UNIT_PRICE = BigDecimal.valueOf(0.2); //final zainicjalizowna od razu albo w konstrukorze

    CostCalculator(BigDecimal unitPrice) {
          UNIT_PRICE = unitPrice;
    }


    public BigDecimal calculate(int pieces){

        return BigDecimal.valueOf(pieces).multiply(UNIT_PRICE);
    }

}
