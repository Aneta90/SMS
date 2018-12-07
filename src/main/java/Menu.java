import picocli.CommandLine;
import picocli.CommandLine.Option;
import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    public static void start() {

        NaiveCompressor naiveCompressor = new NaiveCompressor();
        Paginator paginator = new Paginator(10);
        CostCalculator costCalculator = new CostCalculator(new BigDecimal(0.2));
        String[] args = {"-t", "-d"};
        new CommandLine(naiveCompressor).parse(args);

    }
}
