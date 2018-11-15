package pojoclasses;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class Farm {



    private ArrayList<Stable> stable = new ArrayList<Stable>();

    private ArrayList<ChickenCoops> chickenCoops = new ArrayList<ChickenCoops>();

    private FarmHouse farmHouse;

    public ArrayList<Stable> getStable() {
        return stable;
    }

    public void setStable(ArrayList<Stable> stable) {
        this.stable = stable;
    }

    public ArrayList<ChickenCoops> getChickenCoops() {
        return chickenCoops;
    }

    public void setChickenCoops(ArrayList<ChickenCoops> chickenCoops) {
        this.chickenCoops = chickenCoops;
    }

    public FarmHouse getFarmHouse() {
        return farmHouse;
    }

    public void setFarmHouse(FarmHouse farmHouse) {
        this.farmHouse = farmHouse;
    }
}
