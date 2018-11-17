public class CarrotPlant extends Crop {


    public Edible yields() {
        if (!this.getHasBeenHarvested() && !this.getHasBeenFertilized())
        {
            return new Carrot();
        }

       else return null;
    }
}
