/*
this class was made by derian
 */



import org.junit.Assert;
import org.junit.Test;



public class HorseTest
{



    @Test
    public void horseConstructorTest()
    {
        //Given
        Horse skoob = new Horse();
        String expected = "Horse";

        //When
        String actual = skoob.getClass().getSimpleName();

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void horse_Is_An_Animal_Test()
    {
        //Given
        Horse skoob = new Horse();
        boolean expected = true;

        //When
        boolean actual = skoob instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void horse_Is_A_Rideable_Test()
    {
        //Given
        Horse skoob = new Horse();
        boolean expected = true;

        //When
        boolean actual = skoob instanceof Rideable;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void horse_Is_A_NoiseMaker_Test()
    {
        //Given
        Horse skoob = new Horse();
        boolean expected = true;

        //When
        boolean actual = skoob instanceof NoiseMaker;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void horse_Is_An_Eater_Test()
    {
        //Given
        Horse skoob = new Horse();
        boolean expected = true;

        //When
        boolean actual = skoob instanceof Eater;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void eatTest()
    {
        //Given
        Horse skoob = new Horse();
        Tomato tom = new Tomato();
        Edible expected = null;

        //When
        skoob.eat(tom);
        Edible actual = skoob.eat(tom);

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void makeNoiseTest()
    {
        //Given
        Horse skoob = new Horse();
        String expected = "neeeIIIIGHHHH";

        //When
        String actual = skoob.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }
    
    
    
}
