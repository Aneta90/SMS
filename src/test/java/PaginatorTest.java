import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

public class PaginatorTest extends TestCase {

    private Paginator paginator;
    private static int SMS_LENGTH = 10;

    @Before
    public void setUpPaginator(){
        paginator = new Paginator(SMS_LENGTH);
    }

    @Test
    public void paginate(){

        String example= "ABCDEFGHIJKLMNOP";
        String [] result = paginator.paginate(example);
        assertEquals(result.length,3);
        assertEquals(result[0],"ABC");
    }
}
