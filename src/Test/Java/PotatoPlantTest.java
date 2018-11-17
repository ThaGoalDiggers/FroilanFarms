import org.junit.Assert;
import org.junit.Test;

public class PotatoPlantTest {

    @Test
    public void yeildTestHasBeenFert() {
        Crop potatoplant = new Potatoplant();
        potatoplant.setHasBeenHarvested(false);
        potatoplant.setHasBeenFertilized(true);
        potatoplant.yields();

        String expected = null;

        Edible actual = potatoplant.yields();


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yeildTesthasBeenHarvest() {
        Crop potato = new Potatoplant();
        potato.setHasBeenHarvested(true);
        potato.setHasBeenFertilized(false);
        potato.yields();

        String expected = null;

        Edible actual = potato.yields();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yeildTest(){
        Crop potato = new Potatoplant();
        potato.setHasBeenFertilized(false);
        potato.setHasBeenHarvested(false);

        String expected = new PotatoTest().getClass().getName();

        String actual = potato.yields().getClass().getName();

        Assert.assertEquals(expected,actual);
    }
}
