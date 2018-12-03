import java.math.BigDecimal;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type your message");
        String message = scanner.nextLine();
        NaiveCompressor naiveCompressor = new NaiveCompressor();
        String afterCompression = naiveCompressor.compress(message);
        Paginator paginator = new Paginator(10);
        CostCalculator costCalculator = new CostCalculator(new BigDecimal(0.2));
        System.out.println(costCalculator.calculate(paginator.paginate(afterCompression).length));

    }

}
