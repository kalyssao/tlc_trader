import org.junit.Test;
import org.junit.Assert;

public class BondFundTest {
    @Test
    public void testBondDividend(){
        Bond jamesBond = new Bond("B1", "APPL", 50, 12.0);
        double dividend = jamesBond.calcDividend();
        Assert.assertEquals(12.0 , dividend, 0.1);
    }

    @Test
    public void testFundDividend(){
        Fund newFund = new Fund("F1", "MSFT", 50, 50, 20.0);
        double dividend = newFund.calcDividend();
        Assert.assertEquals(10.0, dividend, 0.1);
    }
}
