package pojoclasses;

import java.util.ArrayList;

public class ChickenCoop {

    private ArrayList<Chicken> chickens = new ArrayList<Chicken>();

    public ArrayList<Chicken> getChickens() {
        return chickens;
    }

    public void setChickens(ArrayList<Chicken> chickens) {
        this.chickens = chickens;
    }

    @Override
    public String toString() {
        return "ChickenCoop{" +
                "chickens=" + chickens +
                '}';
    }
}
