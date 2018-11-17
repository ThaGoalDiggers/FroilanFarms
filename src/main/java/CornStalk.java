public class CornStalk extends Crop {
    public Edible yields() {
        if (!this.getHasBeenHarvested() && !this.getHasBeenFertilized())
        {
            return  new EarCorn();
        }

        return null;
    }
}
