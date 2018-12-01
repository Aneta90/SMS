import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NaiveCompressor implements Compressor {


    public String compress(String message) {

        //InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        //BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        //InputStream stream = new ByteArrayInputStream(message.getBytes(StandardCharsets.UTF_8));
        bufferedReader.lines()
        .map(a->Stream.of(a.split(" ")).map(b->b.substring(0,1).toUpperCase()+ b.substring(1)).collect(Collectors.joining(" ")));
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
