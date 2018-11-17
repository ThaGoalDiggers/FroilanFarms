import org.junit.Assert;
import org.junit.Test;

public class TomatoPlantTest {

    @Test
    public void yeildTesthasBeenFert() {
        Crop tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenHarvested(false);
        tomatoPlant.setHasBeenFertilized(true);
        tomatoPlant.yields();

        String expected = null;

        Edible actual = tomatoPlant.yields();


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yeildTesthasBeenHarvest() {
        Crop tomatoPlant = new TomatoPlant();
        tomatoPlant.setHasBeenHarvested(true);
        tomatoPlant.setHasBeenFertilized(false);
        tomatoPlant.yields();

        String expected = null;

        Edible actual = tomatoPlant.yields();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yeildTest(){
        Crop tomato = new TomatoPlant();
        tomato.setHasBeenFertilized(false);
        tomato.setHasBeenHarvested(false);

        String expected = new Tomato().getClass().getName();


        String actual = tomato.yields().getClass().getName();

        Assert.assertEquals(expected,actual);
    }
}
