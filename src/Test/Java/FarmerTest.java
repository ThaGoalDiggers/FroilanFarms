import Classes.Farmer;
import Interfaces.Edible;
import Interfaces.Rideable;
import junit.framework.Assert;
import org.junit.Test;

/*
This test class was made by Bobby
 */

public class FarmerTest {
    Farmer farmer = new Farmer();

    @Test
    public void eatTest(){

    }

    @Test
    public void makeNoiseTest(){
        Assert.assertEquals("The Farmer whistled while he worked.", farmer.makeNoise());
    }

//    @Test
//    public void plantTest(){
//        CropRow cropRow;
//        Crop crop;
//        Assert.assertTrue(System.out.println("The Farmer planted " + crop + " in the " + cropRow + ".") == farmer.plant(cropRow, crop));
//    }

    @Test
    public void mountTest(){
        Rideable rideable;
        Assert.assertTrue(("The Farmer mounted the " + rideable + ".") == farmer.mount(rideable));
    }

    @Test
    public void dismountTest(){
        Rideable rideable;
        Assert.assertTrue(("The farmer dismounted the " + rideable + ".") == farmer.dismount(rideable));
    }
}
