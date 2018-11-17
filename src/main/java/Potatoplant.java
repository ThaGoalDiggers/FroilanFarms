public class Potatoplant extends Crop {
    public Edible yields() {
        if (!this.getHasBeenFertilized() && !this.getHasBeenHarvested())
        {
            return new Potato();
        }
        else return null;
    }
}
