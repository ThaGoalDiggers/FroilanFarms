import Interfaces.Eater;
import Interfaces.Edible;
import Interfaces.NoiseMaker;
import Interfaces.Produce;
import edibles.EarCorn;
import org.junit.Assert;
import org.junit.Test;

public class ChickenTest
{



    //i forget how 2 test konstrukterz =(
    @Test
    public void chickenConstructorTest()
    {
        //Given
        Chicken chicken = new Chicken();
        Chicken expected = chicken;

        //When
        Chicken actual = chicken;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void chicken_Is_A_Chicken_Test()
    {
        //Given
        Chicken chicken = new Chicken();
        boolean expected = true;

        //When
        boolean actual = chicken instanceof Chicken;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void chicken_Is_An_Animal_Test()
    {
        //Given
        Chicken chicken = new Chicken();
        boolean expected = true;

        //When
        boolean actual = chicken instanceof Animal;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void chicken_Is_A_Produce_Test()
    {
        //Given
        Chicken chicken = new Chicken();
        boolean expected = true;

        //When
        boolean actual = chicken instanceof Produce;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void chicken_Is_A_NoiseMaker_Test()
    {
        //Given
        Chicken chicken = new Chicken();
        boolean expected = true;

        //When
        boolean actual = chicken instanceof NoiseMaker;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void chicken_Is_An_Eater_Test()
    {
        //Given
        Chicken chicken = new Chicken();
        boolean expected = true;

        //When
        boolean actual = chicken instanceof Eater;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void eatTest()
    {
        //Given
        Chicken chicken = new Chicken();
        Edible earCorn = new EarCorn();
        Edible expected = null;

        //When
        chicken.eat(earCorn);
        Edible actual = earCorn;

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void makeNoiseTest()
    {
        //Given
        Chicken chicken = new Chicken();
        String expected = "Buck-buck buGWACK";

        //When
        String actual = chicken.makeNoise();

        //Then
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void yieldsTest(){}



}
