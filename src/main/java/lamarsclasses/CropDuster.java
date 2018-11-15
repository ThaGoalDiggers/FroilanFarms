package lamarsclasses;

import Interfaces.FarmVehicle;
import abtractlamar.AirCraft;

public class CropDuster extends AirCraft implements FarmVehicle {

    public String fertlilize;




   public CropDuster(String fly, String fertlilize) {
        super(fly);
        this.fertlilize=fertlilize;
    }


    public String getFertlilize() {
        return fertlilize;
    }

    public void setFertlilize(String fertlilize) {
        this.fertlilize = fertlilize;
    }

    public void operate(Farm farm) {

       return farm;

    }



}
