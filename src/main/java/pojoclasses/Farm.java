package pojoclasses;

import java.util.ArrayList;

public class Farm {



    private ArrayList<Stables> stable = new ArrayList<Stables>();

    private ArrayList<ChickenCoop> chickenCoops = new ArrayList<ChickenCoop>();

    private FarmHouse farmHouse;

    public ArrayList<Stables> getStable() {
        return stable;
    }

    public void setStable(ArrayList<Stables> stable) {
        this.stable = stable;
    }

    public ArrayList<ChickenCoop> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ArrayList<ChickenCoop> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }
}
