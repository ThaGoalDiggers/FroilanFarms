public class TomatoPlant extends Crop {


    public Edible yields() {
        if (!this.getHasBeenHarvested() && !this.getHasBeenFertilized())
        {
            return new Tomato();
        }
      else   return null;
    }
}
