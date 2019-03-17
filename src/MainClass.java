import org.junit.Assert;
import org.junit.Test;

public class MainClass {

    private int getLocalNumber() {
        return 14;
    }

    @Test
    public void testGetLocalNumber() {
        Assert.assertEquals("Number doesn't match expected value: ", 14, getLocalNumber());
    }

}
