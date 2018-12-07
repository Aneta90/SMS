import picocli.CommandLine;
import picocli.CommandLine.*;
import java.math.BigDecimal;
import java.util.concurrent.Callable;

@Command(name = "Runner")
public class Runner implements Callable<CostCalculator> {

            public static void main(String[] args) throws Exception {
                CommandLine.call(new Runner(), args);
            }

            @Parameters
            String message;

            @Override
            public CostCalculator call() throws Exception {

                NaiveCompressor naiveCompressor = new NaiveCompressor();
                String afterCompression = naiveCompressor.compress(message);
                Paginator paginator = new Paginator(10);
                CostCalculator costCalculator = new CostCalculator(new BigDecimal(0.2));
                System.out.println(costCalculator.calculate(paginator.paginate(afterCompression).length));
                return costCalculator;
            }

        }




