/*
This test class was made by Bobby
 */

import Interfaces.Edible;
import Interfaces.Rideable;
import edibles.Potato;
import org.junit.Assert;
import org.junit.Test;
import plants.Crop;
import pojoclasses.CropRow;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

public class FarmerTest {

    @Test
    public void eatTest(){
        Farmer farmer = new Farmer();
        Potato potato = new Potato();
        Edible expected = null;

        farmer.eat(potato);
        Edible actual = potato;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest(){
        Farmer farmer = new Farmer();
        Assert.assertEquals("The Farmer whistled while he worked.", farmer.makeNoise());
    }

    @Test
    public void plantTest(){

    }

    @Test
    public void mountTest(){

    }

    @Test
    public void dismountTest(){

    }
}