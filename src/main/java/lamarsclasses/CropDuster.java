package lamarsclasses;

import Interfaces.FarmVehicle;
import lamarsabstract.AirCraft;
import pojoclasses.Farm;

public class CropDuster extends AirCraft implements FarmVehicle {



    public String fly() {
        return "flys around crops ";
    }

    public String makeNoise() {
        return "Plane noises";
    }

    public boolean ismounted() {
        return true;
    }

    public boolean isNotMounted() {
        return false ;
    }

    public void operate(Farm farm) {

    }

    public void operate() {
        System.out.println("operating");
    }
}
