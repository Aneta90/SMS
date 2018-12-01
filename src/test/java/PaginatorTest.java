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
        String example = "ABCDEFGHIJKLMNOPRSTUWYZ";
        String examp2 = "ABC";
        assertEquals(paginator.paginate(example).length,3);
        assertEquals(example[0],"ABC");
    }

}
