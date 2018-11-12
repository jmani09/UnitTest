package manitec.com.myapplication;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by mani on 7/10/18.
 */
public class OperationTest {
    private Operation mOperation;

    @Before
    public void setup(){
        mOperation = new Operation();
    }

    @Test
    public void operationNotNull(){
        assertNotNull(mOperation);
    }

    @Test
    public void suma() throws Exception {
        assertEquals("7",mOperation.suma("3","4"));
    }

    @Test
    public void resta() throws Exception {
        assertEquals("-1", mOperation.resta("3","4"));
    }

    @Test
    public void product() throws Exception {
        assertEquals("9", mOperation.prodcut("3","3"));
    }
}