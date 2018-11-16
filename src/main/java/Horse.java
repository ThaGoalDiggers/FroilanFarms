/*
This class was made by Scratch Gobo
 */



import Interfaces.Edible;
import Interfaces.Rideable;



public class Horse extends Animal implements Rideable
{



    public Horse(){}



    public void eat(Edible food)
    {
        System.out.println("The horse, " + getClass().getName() + ", eats the " + food + ".");
        food = null;
    }



    public String makeNoise() { return "neeeIIIIGHHHH"; }



}
