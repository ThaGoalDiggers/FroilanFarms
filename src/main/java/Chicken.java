/*
This class was made by Curly Fry
 */



import Interfaces.Edible;
import Interfaces.Produce;



public class Chicken extends Animal implements Produce
{



    public Chicken(){}



    public void eat(Edible food)
    {
        System.out.println("The chicken, " + getClass().getName() + ", eats the " + food + ".");
        food = null;
    }



    public String makeNoise() { return "Buck-buck buGWACK"; }



    public Edible yields(Boolean hasBeenFertilize)
    {
        if (hasBeenFertilized == false) { return new EdibleEgg(); }

        else return null;
    }



}
