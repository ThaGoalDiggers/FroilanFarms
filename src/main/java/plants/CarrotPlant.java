package plants;

import Interfaces.Edible;
import edibles.Carrot;

public class CarrotPlant extends Crop {


    public Edible yields() {
        if (this.getHasBeenHarvested() && this.getHasBeenFertilized() == false)
        {
            return new Carrot();
        }

       else return null;
    }
}
