import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import picocli.CommandLine;
import picocli.CommandLine.Option;

@CommandLine.Command(description = "Class to compress SMS text and calculate the price of text message")
public class NaiveCompressor implements Compressor {

  // @CommandLine.Parameters(type = NaiveCompressor.class, description = "Any String to compress")

    //private List<NaiveCompressor> files = new ArrayList<>();
    @Option(names= "-t", description= "type text to compress")
    String messageToCompress;
    public String compress(String message) {
        return Stream.of(message.split(" "))
                .map(a-> Character.toUpperCase(a.charAt(0)) + a.substring(1)).collect(Collectors.joining(""));
    }

    @Option(names= "-d", description= "type text to decompress")
    String messageToDecompress;
    @Override
    public String decompress(String decompressedMessage) {
        return Stream.of(decompressedMessage.split("(?<=.)(?=\\p{Lu})"))
                .map(a-> Character.toLowerCase(a.charAt(0)) + a.substring(1)).collect(Collectors.joining(" "));
    }

}
