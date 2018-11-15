package lamarsclasses;

import Interfaces.FarmVehicle;
import lamarsabstract.Vehicle;
import pojoclasses.Farm;

public class Tractor extends Vehicle implements FarmVehicle  {


    private String harvest;

    public Tractor (String harvest){

        this.harvest=harvest;

    }

    public String getHarvest() {
        return harvest;
    }

    public void setHarvest(String harvest) {
        this.harvest = harvest;
    }

    public void operate(Farm farm) {

        return farm;

    }

    public void operate() {

    }

    public String makeNoise() {
        return null;
    }

    public boolean ismounted() {
        return false;
    }
}
