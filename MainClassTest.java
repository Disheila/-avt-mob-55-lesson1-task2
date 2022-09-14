import org.junit.Assert;
import org.junit.Test;



public class MainClassTest extends MainClass {

    @Test
    public void testGetClassNumber(){
        if (getClassNumber() > 45) {
        Assert.fail ("Class number is not more then 45");
        }
    }
}
