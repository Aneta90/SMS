import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PaginatorTest{

    private Paginator paginator;
    private static int SMS_LENGTH = 10;

    @Before
    public void testSetUpPaginator(){
        paginator = new Paginator(SMS_LENGTH);
    }

    @Test
    public void testPaginate(){
        String example= "ABCDEFGHIJKLMNOP";
        String [] result = paginator.paginate(example);
        assertEquals(result.length,2);
        assertEquals(result[0],"ABCDEFGHIJ");
        assertEquals(result[1],"KLMNOP");
    }
}
