public class OnionPlant extends Crop {
    public Edible yields() {
        if (this.getHasBeenHarvested() && this.getHasBeenFertilized() == false)
        {
            return new Onion();
        }
        return null;
    }
}
