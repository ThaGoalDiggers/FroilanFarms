/*
This class was made by Bobby
 */

import Interfaces.Botanist;
import Interfaces.Edible;
import Interfaces.Rideable;
import Interfaces.Rider;
import edibles.Tomato;
import plants.Crop;
import pojoclasses.CropRow;

import java.util.ArrayList;

public class Farmer extends Person implements Botanist, Rider {
    public Farmer() {
    }

    public void eat(Edible food){
        food = null;
    }

    public String makeNoise(){
        return "The Farmer whistled while he worked.";
    }

    public void plant(CropRow cropRow, Crop crop){
        ArrayList<Crop> row = new ArrayList<Crop>();
        cropRow.setPlantedCrops(row);
    }

    public void mount(Rideable rideable){
        System.out.println("The Farmer mounted the " + rideable + ".");
    }

    public void dismount(Rideable rideable){
        System.out.println("The farmer dismounted the " + rideable + ".");
    }
}