import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Map;

public class MockedPrice {
    Trade t1;

    @Before
    public void setUp(){
        t1 = new Trade("T1" ,"APPL", 100);
    }

    @Test
    public void shouldReturnMockedPrice(){


        Assert.assertEquals(400.0, t1.getPrice(), 0.01);
    }

    @Test
    public void shouldRecordTrade(){
        Map<String, Trade> record = Trade.recordTrade(t1);

    }
}
