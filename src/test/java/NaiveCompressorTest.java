
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NaiveCompressorTest {

    private static NaiveCompressor naiveCompressor;

    @Before
    public void setUpCompressor(){
        naiveCompressor = new NaiveCompressor();
    }

    @Test
    public void testCompress(){
        String message = "Java jest fajna";
        assertEquals(naiveCompressor.compress(message),"JavaJestFajna");
        assertEquals(naiveCompressor.compress("Javajestfajna"),"Javajestfajna");
    }

    @Test
    public void testDecompress(){
        assertEquals(naiveCompressor.decompress("JavaJestFajna"),"java jest fajna");
    }


}
