import Compressor.NaiveCompressor;
import CostCalculator.CostCalculator;

import java.math.BigDecimal;
import java.util.Scanner;

public class Menu {

    public static void start() {

        NaiveCompressor naiveCompressor = new NaiveCompressor();
        Paginator paginator = new Paginator(10);
        CostCalculator costCalculator = new CostCalculator(new BigDecimal(0.2));

        System.out.println("Type in your message: ");
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();

        String compressedMessage = naiveCompressor.compress(message);
        String [] paginatedMessage = paginator.paginate(compressedMessage);
        BigDecimal finalCost = costCalculator.calculate(paginatedMessage.length);
        System.out.println("Final cost for SMS: " +compressedMessage +  " is " + finalCost);

        System.out.println("Your message before compressing: " + naiveCompressor.decompress(compressedMessage));

    }
}
