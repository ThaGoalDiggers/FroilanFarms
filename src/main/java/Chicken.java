/*
This class was made by Curly Fry
 */


public class Chicken extends Animal implements Produce
{



    public boolean hasBeenFertilized = false;



    public Chicken(){}



    public Edible eat(Edible food)
    {
        System.out.println("The chicken, " + getClass().getName() + ", eats the " + food.getClass().getSimpleName() + ".");
        food = null;
        return food;
    }



    public String makeNoise() { return "Buck-buck buGWACK"; }



    public Edible yields()
    {
        if (!hasBeenFertilized) { return (Edible) new EdibleEgg(); }
        else return null;
    }



}
