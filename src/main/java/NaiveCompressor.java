import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NaiveCompressor implements Compressor {

    public String compress(String message) {

     String output = Stream.of(message.split(" "))
             .map(a-> Character.toUpperCase(a.charAt(0)) + a.substring(1)).collect(Collectors.joining(""));
        return output;
    }

    @Override
    public String decompress(String decompressedMessage) {
        return null;
    }

    public static void main(String[] args) {
        NaiveCompressor compressor = new NaiveCompressor();
        System.out.println(compressor.compress("Java jest fajna"));
    }

}
