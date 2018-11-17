import org.junit.Assert;
import org.junit.Test;

public class CarrotTest {

    @Test
    public void CarrotisEdibleTest() {
        Carrot carrot = new Carrot();

        Assert.assertTrue(carrot instanceof Edible);
    }
}
