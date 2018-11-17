import org.junit.Assert;
import org.junit.Test;

public class PotatoTest {

    @Test
    public void PotatoisEdibleTest() {
        Potato potato = new Potato();

        Assert.assertTrue(potato instanceof Edible);
    }
}
