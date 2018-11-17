/*
this class was made by derian
 */



import org.junit.Assert;
import org.junit.Test;



public class ChickenTest
{



    @Test
    public void chickenConstructorTest()
    {
        //Given
        Chicken boi = new Chicken();
        String expected = "Chicken";

        //When
        String actual = boi.getClass().getSimpleName();

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void chicken_Is_An_Animal_Test()
    {
        //Given
        Chicken boi = new Chicken();
        boolean expected = true;

        //When
        boolean actual = boi instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void chicken_Is_A_Produce_Test()
    {
        //Given
        Chicken boi = new Chicken();
        boolean expected = true;

        //When
        boolean actual = boi instanceof Produce;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void chicken_Is_A_NoiseMaker_Test()
    {
        //Given
        Chicken boi = new Chicken();
        boolean expected = true;

        //When
        boolean actual = boi instanceof NoiseMaker;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void chicken_Is_An_Eater_Test()
    {
        //Given
        Chicken boi = new Chicken();
        boolean expected = true;

        //When
        boolean actual = boi instanceof Eater;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void eatTest()
    {
        //Given
        Chicken boi = new Chicken();
        Tomato tom = new Tomato();
        Edible expected = null;

        //When
        boi.eat(tom);
        Edible actual = boi.eat(tom);

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void makeNoiseTest()
    {
        //Given
        Chicken boi = new Chicken();
        String expected = "Buck-buck buGWACK";

        //When
        String actual = boi.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void yieldsTest_NotFertilized()
    {
        //Given
        Chicken boi = new Chicken();
        String expected = ((Edible) new EdibleEgg()).getClass().getSimpleName();

        //When
        String actual = boi.yields().getClass().getSimpleName();

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void yieldsTest_YES_Fertilized()
    {
        //Given
        Chicken boi = new Chicken();
        boi.hasBeenFertilized = true;
        Edible expected = null;

        //When
        Edible actual = boi.yields();

        //Then
        Assert.assertEquals(expected, actual);
    }



}
