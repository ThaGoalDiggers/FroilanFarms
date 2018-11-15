/*
This class was made by Bobby
 */

import Interfaces.Botanist;
import Interfaces.Edible;
import Interfaces.Rideable;
import Interfaces.Rider;
import plants.Crop;

public class Farmer extends Person implements Botanist, Rider {
    public Farmer() {
    }

    public void eat(Edible food){
        System.out.println("The Farmer ate " + food + " and it was yummy.");
        food = null;
    }

    public String makeNoise(){
        return "The Farmer whistled while he worked.";
    }

    public void plant(CropRow cropRow, Crop crop){
        System.out.println("The Farmer planted " + crop + " in the " + cropRow + ".");
    }

    public void mount(Rideable rideable){
        System.out.println("The Farmer mounted the " + rideable + ".");
    }

    public void dismount(Rideable rideable){
        System.out.println("The farmer dismounted the " + rideable + ".");
    }
}