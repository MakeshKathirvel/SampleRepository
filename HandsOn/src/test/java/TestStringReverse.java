import org.testng.Assert;
import org.testng.annotations.Test;
import sun.security.krb5.internal.EncAPRepPart;

/**
 * Created by makeshk.kathirvel on 4/10/2017.
 */
public class TestStringReverse {

    @Test(enabled=true)
    public void testStringReverseusingCharArray(String s){
        StringReverse stringReverse = new StringReverse();
        char[] actualResult = stringReverse.StringReverseusingCharArray("Test");
        Assert.assertNotNull(actualResult);
        Assert.assertEquals(actualResult,"tseT");
        Assert.assertEquals(actualResult,"tset");
    }

}
