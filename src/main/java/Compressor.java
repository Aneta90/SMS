import java.io.IOException;

public interface Compressor {

    String compress(String userMessage) throws IOException;
    String decompress(String decompressedMessage);
}
