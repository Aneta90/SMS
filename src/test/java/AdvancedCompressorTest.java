import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class AdvancedCompressorTest extends TestCase {

    private static AdvancedCompressor advancedCompressor;

    @Before
    public void SetUpCompressor() {
        advancedCompressor = new AdvancedCompressor();
    }

    @Test
    public void compress(){

        String message = "Java jest fajna";
        String exitMessage = advancedCompressor.compress(message);
        assertTrue(exitMessage.length() < message.length());

    }

    @Test
    public void emptyString(){
        String message=" ";
        assertEquals(message,advancedCompressor.compress(" "));
    }

    @Test
    public void decompress(){

        String message= "JavaJestFajna";
        String exitMessage = advancedCompressor.decompress(message);
        assertTrue(message.length()<exitMessage.length());

    }
}
