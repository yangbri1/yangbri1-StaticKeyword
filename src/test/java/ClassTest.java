
import org.junit.Assert;
import org.junit.Test;

public class ClassTest
{
    Runner r = new Runner();

    /**
     * After running changeClassVar("xyz"), the value of global_var should be "xyz".
     */
    @Test
    public void classTest1(){
        Class.global_var="abc";
        r.changeClassVar("xyz");
        Assert.assertEquals("xyz", Class.global_var);

    }
}
