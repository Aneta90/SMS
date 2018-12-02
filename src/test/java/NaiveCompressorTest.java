import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class NaiveCompressorTest extends TestCase {

    private NaiveCompressor naiveCompressor;

    @Before
    public void setUpCompressor(){
        naiveCompressor = new NaiveCompressor();
    }

    @Test
    public void compress(){
        assertEquals(naiveCompressor.compress("Java jest fajna"),"JavaJestFajna");
        assertEquals(naiveCompressor.compress("Javajestfajna"),"Javajestfajna");
    }

    @Test
    public void decompress(){
        assertEquals(naiveCompressor.decompress("JavaJestFajna"),"Java jest fajna");
    }


}
