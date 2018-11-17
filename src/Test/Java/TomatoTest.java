import org.junit.Assert;
import org.junit.Test;

public class TomatoTest {

    @Test
    public void TomatoisEdibleTest() {
        EdibleEgg edibleEgg = new EdibleEgg();

        Assert.assertTrue(edibleEgg instanceof Edible);
    }
}
