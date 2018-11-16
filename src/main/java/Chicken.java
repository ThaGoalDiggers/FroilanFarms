/*
This class was made by Curly Fry
 */


public class Chicken extends Animal implements Produce
{

public boolean hasBeenFertilized;

    public Chicken(){}



    public void eat(Edible food)
    {
        System.out.println("The chicken, " + getClass().getName() + ", eats the " + food + ".");
        food = null;
    }



    public String makeNoise() { return "Buck-buck buGWACK"; }



    public Edible yields()
    {
        if (!hasBeenFertilized) { return (Edible) new EdibleEgg(); }

        else return null;
    }



}
