package pojoclasses;

import java.util.ArrayList;

public class Stables {

    ArrayList<Horse> horse = new ArrayList<Horse>();

    public ArrayList<Horse> getHorse() {
        return horse;
    }

    public void setHorse(ArrayList<Horse> horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "Stables{" +
                "horse=" + horse +
                '}';
    }
}
