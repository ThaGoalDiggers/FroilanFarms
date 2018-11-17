/*
This class was made by Scratch Gobo
 */


public class Horse extends Animal implements Rideable
{



    public Horse(){}



    public Edible eat(Edible food)
    {
        System.out.println("The horse, " + getClass().getName() + ", eats the " + food.getClass().getSimpleName() + ".");
        food = null;
        return food;
    }



    public String makeNoise() { return "neeeIIIIGHHHH"; }



}
