/*
This class was made by Scratch Gobo
 */


public class Horse extends Animal implements Rideable
{

    public boolean isMounted = false;


    public Horse(){}




    public void eat(Edible food)
    {
        System.out.println("The horse, " + getClass().getName() + ", eats the " + food + ".");
        food = null;
    }



    public String makeNoise() { return "neeeIIIIGHHHH"; }

    public boolean isMounted() {
        return isMounted;
    }

    public void setMounted(boolean mounted) {
        isMounted = mounted;
    }
}
