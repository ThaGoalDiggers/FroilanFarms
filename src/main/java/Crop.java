

public  abstract class Crop implements Produce {

   private boolean hasBeenHarvested;
   private boolean hasBeenFertilized;

    public Crop(){
        hasBeenHarvested = false;
        hasBeenFertilized = false;
    }
    public boolean getHasBeenHarvested() {
        return hasBeenHarvested;
    }
    public void setHasBeenHarvested(boolean hasBeenHarvested) {
        this.hasBeenHarvested = hasBeenHarvested;
    }
    public boolean getHasBeenFertilized() {
        return hasBeenFertilized;
    }
    public void setHasBeenFertilized(boolean hasBeenFertilized) {
        this.hasBeenFertilized = hasBeenFertilized;
    }

}
