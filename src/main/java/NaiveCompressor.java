import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NaiveCompressor implements Compressor {


    @Override
    public String compress(String message) {
        return Stream.of(message.split(" "))
                .map(a-> Character.toUpperCase(a.charAt(0)) + a.substring(1)).collect(Collectors.joining(""));
    }

    @Override
    public String decompress(String decompressedMessage) {
        return Stream.of(decompressedMessage.split("(?<=.)(?=\\p{Lu})"))
                .map(a-> Character.toLowerCase(a.charAt(0)) + a.substring(1)).collect(Collectors.joining(" "));
    }

}
