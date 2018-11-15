package lamarsclasses;

import Interfaces.FarmVehicle;

public class Tractor implements FarmVehicle {

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
}
