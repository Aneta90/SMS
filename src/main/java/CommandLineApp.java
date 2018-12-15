import picocli.CommandLine.Parameters;
import picocli.CommandLine.Option;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;

public class CommandLineApp {

   @Option(names="-l", description = "Length of the message.")
   int SMS_LENGHT;

   @Option(names="-p", description = "Unit price of the message.")
   BigDecimal UNIT_PRICE;

   @Option(names="-n", description = "Use the naive compressor.")
    boolean useNaiveCompressor;

   @Option(names="-d", description = "Use the decompress mode.")
   boolean useDecompressionMode;

   @Parameters
   private String [] message;

   public void run() throws IOException {

       /*NaiveCompressor naiveCompressor = new NaiveCompressor();
       String afterCompression = naiveCompressor.compress(String.valueOf(message));
       Paginator paginator = new Paginator(SMS_LENGHT);
       CostCalculator costCalculator = new CostCalculator(UNIT_PRICE);
       System.out.println("Cost of your message is " + costCalculator.calculate(paginator.paginate(afterCompression).length));*/

       Paginator paginator = new Paginator(SMS_LENGHT);
       CostCalculator calculator = new CostCalculator(UNIT_PRICE);
       Compressor compressor = new NaiveCompressor();
       String afterCompression = compressor.compress(Arrays.toString(message));
       String[] paginatedMessage = paginator.paginate(afterCompression);
       //System.out.println("Your codded and splited message: " + Arrays.toString(paginatedMessage));
       System.out.println("Cost of your message(s): " + calculator.calculate(paginatedMessage.length));

       }
   }






