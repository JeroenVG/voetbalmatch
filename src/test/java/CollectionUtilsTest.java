import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jvangool on 1/09/2015.
 */
public class CollectionUtilsTest {

    private CollectionUtils coll ;

    @Before
    public void setUp() throws Exception{
        coll = new CollectionUtils();
    }

    @Test
    public void testje() throws Exception{
        assertEquals(coll.sum(2, 6), 8);
    }

}
