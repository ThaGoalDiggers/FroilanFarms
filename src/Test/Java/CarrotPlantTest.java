import org.junit.Assert;
import org.junit.Test;

public class CarrotPlantTest {
    @Test
    public void yeildTesthasBeenFert() {
        Crop carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenHarvested(false);
        carrotPlant.setHasBeenFertilized(true);
        carrotPlant.yields();

        String expected = null;

        Edible actual = carrotPlant.yields();


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yeildTesthasBeenHarvest() {
        Crop carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenHarvested(true);
        carrotPlant.setHasBeenFertilized(false);
        carrotPlant.yields();

        String expected = null;

        Edible actual = carrotPlant.yields();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yeildTest(){
        Crop carrotPlant = new CarrotPlant();
        carrotPlant.setHasBeenFertilized(false);
        carrotPlant.setHasBeenHarvested(false);

        String expected = new Carrot().getClass().getName();


        String actual = carrotPlant.yields().getClass().getName();

        Assert.assertEquals(expected,actual);
    }
}
