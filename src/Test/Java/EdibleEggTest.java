import org.junit.Assert;
import org.junit.Test;

public class EdibleEggTest {


    @Test
    public void EdibleEggisEdibleTest() {
        EdibleEgg edibleEgg = new EdibleEgg();

        Assert.assertTrue(edibleEgg instanceof Edible);
    }




}
