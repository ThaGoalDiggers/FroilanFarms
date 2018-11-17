
import org.junit.Assert;
import org.junit.Test;



public class CornStalksTest {

    @Test
    public void yeildTesthasBeenFert() {
        Crop cornStalk = new CornStalk();
        cornStalk.setHasBeenHarvested(false);
        cornStalk.setHasBeenFertilized(true);
        cornStalk.yields();

        String expected = null;

        Edible actual = cornStalk.yields();


        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yeildTesthasBeenHarvest() {
        Crop cornStalk = new CornStalk();
        cornStalk.setHasBeenHarvested(true);
        cornStalk.setHasBeenFertilized(false);
        cornStalk.yields();

        String expected = null;

        Edible actual = cornStalk.yields();

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void yeildTest(){
        Crop corn = new CornStalk();
        corn.setHasBeenFertilized(false);
        corn.setHasBeenHarvested(false);

        String expected = new EarCorn().getClass().getName();


        String actual = corn.yields().getClass().getName();

        Assert.assertEquals(expected,actual);
    }
}
