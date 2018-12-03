import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

import static junit.framework.TestCase.assertTrue;

public class AdvancedCompressorTest {

    private static AdvancedCompressor advancedCompressor;

    @Before
    public void SetUpCompressor() {
        advancedCompressor = new AdvancedCompressor();
    }

    @Test
    public void compress() throws IOException {

        String message = "Java jest fajna";
        String exitMessage = advancedCompressor.compress(message);
        assertTrue(exitMessage.length() < message.length());

    }

    @Test
    public void decompress(){

        String message= "JavaJestFajna";
        String exitMessage = advancedCompressor.decompress(message);
        assertTrue(message.length()<exitMessage.length());

    }
}
