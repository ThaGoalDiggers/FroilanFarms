/*
This test class was made by Bobby
 */

import Interfaces.Edible;
import Interfaces.Rideable;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class FarmerTest {
    Farmer farmer = new Farmer();
    Edible food;
    Rideable rideable;

    @Test
    public void eatTest(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        String expected = "The Farmer ate " + food + " and it was yummy.\n";
        Assert.assertEquals(expected, outContent.toString());
        System.setOut(null);
    }

    @Test
    public void makeNoiseTest(){
        Assert.assertEquals("The Farmer whistled while he worked.", farmer.makeNoise());
    }

    @Test
    public void plantTest(){

    }

    @Test
    public void mountTest(){
        Rideable rideable;
        String expected = "The Farmer mounted the " + rideable + ".";
        String actual = farmer.mount(rideable);
    }

    @Test
    public void dismountTest(){
        Rideable rideable;
        String expected = "The farmer dismounted the " + rideable + ".";
        String actual = farmer.dismount(rideable);
    }
}