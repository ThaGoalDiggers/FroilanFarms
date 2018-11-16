/*
This test class was made by Bobby
 */

import Interfaces.Edible;
import Interfaces.Rideable;
import edibles.Potato;
import edibles.Tomato;
import lamarsclasses.Tractor;
import org.junit.Assert;
import org.junit.Test;
import plants.Crop;
import pojoclasses.CropRow;
import pojoclasses.Farm;

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
        Edible actual = farmer.eat(potato);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void makeNoiseTest(){
        Farmer farmer = new Farmer();
        Assert.assertEquals("The Farmer whistled while he worked.", farmer.makeNoise());
    }

    @Test
    public void plantTest(){
        Farmer farmer = new Farmer();
        CropRow cropRow = new CropRow();
        Tomato tomato = new Tomato();

    }

    @Test
    public void mountTest(){
        Farmer farmer = new Farmer();
        Tractor tractor = new Tractor();
        boolean expected = true;
        boolean actual = farmer.mount(tractor);
        Assert.assertTrue(expected == actual);
    }

    @Test
    public void dismountTest(){
        Farmer farmer = new Farmer();
        Tractor tractor = new Tractor();
        boolean expected = false;
        boolean actual = farmer.dismount(tractor);
        Assert.assertTrue(expected == actual);
    }
}