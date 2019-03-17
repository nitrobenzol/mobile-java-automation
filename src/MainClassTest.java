import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{

    @Test
    public void testGetLocalNumber()
    {
        Assert.assertTrue(getLocalNumber() + " is not equal to 14!", getLocalNumber()==14);
    }

    @Test
    public void testGetClassNumber()
    {
        Assert.assertTrue(getClassNumber() + " is not bigger than 45!",getClassNumber() > 45);
    }
}
