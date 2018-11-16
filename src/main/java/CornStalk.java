public class CornStalk extends Crop {
    public Edible yields() {
        if (this.getHasBeenHarvested() && this.getHasBeenFertilized() == false)
        {
            return new EarCorn();
        }

        return null;
    }
}
