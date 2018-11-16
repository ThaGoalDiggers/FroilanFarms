

import java.util.ArrayList;

public class CropRow {

    private ArrayList<Crop> plantedCrops = new ArrayList<Crop>();

    public ArrayList<Crop> getPlantedCrops() {
        return plantedCrops;
    }

    public void setPlantedCrops(ArrayList<Crop> plantedCrops) {
        this.plantedCrops = plantedCrops;
    }

    @Override
    public String toString() {
        return "CropRow{" +
                "plantedCrops=" + plantedCrops +
                '}';
    }
}
