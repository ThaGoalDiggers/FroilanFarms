public class Potatoplant extends Crop {
    public Edible yields() {
        if (this.getHasBeenFertilized() && this.getHasBeenHarvested() ==false)
        {
            return new Potato();
        }
        else return null;
    }
}
